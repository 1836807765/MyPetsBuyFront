package com.pets.front.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class TrimHttpRequest extends HttpServletRequestWrapper {

	public TrimHttpRequest(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if(value==null)
		{
			return value;
		}
		//return value.trim();
		return ToDBC(value.trim());
	}
	
	
	/**
	 * 把input中的全角字符转换为半角的
	 * @param input
	 * @return
	 */
	public static String ToDBC(String input)
	{
		char chars[] = input.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			if (chars[i] == '\u3000')
			{
				chars[i] = ' ';
			} else if (chars[i] > '\uFF00' && chars[i] < '\uFF5F')
			{
				chars[i] = (char) (chars[i] - 65248);
			}
		}
		return new String(chars);
	}
}

package com.pets.utils;

import java.security.MessageDigest;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommonUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() < 1;
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Map map) {
        return map == null || map.size() < 1;
    }

    //妫�鏌ュ瓧绗︿覆闀垮害锛屽瓧绗︿覆涓簄ull杩斿洖true
    public static boolean isLengthEnough(String str, int length) {
        if (str == null) {
            return false;
        }
        return str.length() >= length;
    }

    public static boolean isEmail(String email) {
        if (email == null) {
            return false;
        }
        return Pattern.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", email);
    }

    public static boolean isPhone(String phoneNum) {
        if (phoneNum == null) {
            return false;
        }
        return Pattern.matches("^1(\\d{10})$", phoneNum);
    }

    //璁＄畻涓�涓瓧绗︿覆鐨凪D5鍊�
    public final static String calculateMD5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            byte[] btInput = s.getBytes();
            // 鑾峰緱MD5鎽樿绠楁硶鐨� MessageDigest 瀵硅薄
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 浣跨敤鎸囧畾鐨勫瓧鑺傛洿鏂版憳瑕�
            mdInst.update(btInput);
            // 鑾峰緱瀵嗘枃
            byte[] md = mdInst.digest();
            // 鎶婂瘑鏂囪浆鎹㈡垚鍗佸叚杩涘埗鐨勫瓧绗︿覆褰㈠紡
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //璁＄畻涓や釜鏃ユ湡鐩稿樊澶╂暟鐨勭粷瀵瑰��
    public static long calculateApartDays(Date date1, Date date2) {
        //涓�澶╁搴旂殑姣鍊�
        long day = 1000L * 60 * 60 * 24;
        return Math.abs(date1.getTime() / day - date2.getTime() / day);
    }
    public static Gson createGson()
	{
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		return gson;
	}
	
}

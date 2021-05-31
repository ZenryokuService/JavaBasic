package yoshida.tkm.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 作成者の名前
 * 2021/05/27
 */
public class StringUtils {
	/** 定数 */
	public static final int EMPTY = 0;
	public static final int EQUAL = 1;
	public static final int IGNORE = 2;
	public static final int ERROR = -1;

	public int stringTest01(String str1, String str2) {
		if ("".equals(str1)) {
			return EMPTY;
		}
		if ("".equals(str2)) {
			return EMPTY;
		}
		return ERROR;
	}

	public int stringUtils02(String str1, String str2) {
		int result = ERROR;
//		if (this.isEmpty(str1, str2)) {
//			return ERROR;
//		}
		if (str1.equals(str2)) {
			result = EQUAL;
		} else {
			result = ERROR;
		}
		return result;
	}

	public int stringUtils03(String str1, String str2) {
		int result = ERROR;
//		if (this.isEmpty(str1, str2)) {
//			return ERROR;
//		}
		if (str1.equalsIgnoreCase(str2)) {
			result = IGNORE;
		} else {
			result = ERROR;
		}
		return result;
	}

	public boolean isEmpty(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return true;
		}
		if ("".equals(str1) || "".equals(str2)) {
			return true;
		}
		return false;
	}

	/**
	 * 引数に渡された、文字列を大文字に変換する。
	 * 
	 * @param moji 返還前の文字列
	 * @return 大文字に変換した後の文字列
	 */
	public String convertUpper(String moji) {
		String result = moji.toUpperCase();
		return result;
	}

	public String convertLower(String moji) {
		String result = moji.toLowerCase();
		return result;
	}

	/** String#substring() */
	public String subString(String str1, int begin, int end) {
		return str1.substring(begin, end);
	}

	public String subString(String str1, int begin) {
		return str1.substring(begin);
	}

	public String replaceStr(String before, String change, String after) {
		return before.replace(change, after);
	}

	public String replaceAllStr(String before, String regrex, String after) {
		return before.replaceAll(regrex, after);
	}

	public void currentDate() {
		Date now = new Date();
		System.out.println(now);
Calendar cal = Calendar.getInstance();
System.out.println(cal.getTime());
	}
}

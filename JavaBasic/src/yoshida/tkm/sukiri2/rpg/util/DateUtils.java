package yoshida.tkm.sukiri2.rpg.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 作成者の名前
 * 2021/05/22
 */
public class DateUtils {
	/**
	 * 引数からjava.util.Dateクラスを生成する。
	 * 引数は入力チェック済みのものを渡す想定。
	 * 
	 * @param yearStr 文字列の年
	 * @param monthStr 文字列の月
	 * @param dayStr 文字列の日
	 * @return java.util.Dateクラス
	 */
	public static Date stringToDate(String yearStr, String monthStr, String dayStr) {
		int year = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr) - 1;
		int date = Integer.parseInt(dayStr);

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		return cal.getTime();
	}

	/**
	 * 引数からYYYY/MM/DDの文字列を生成する。
	 * 引数は入力チェック済みのものを渡す想定。
	 * 
	 * @param yearStr 文字列の年
	 * @param monthStr 文字列の月
	 * @param dayStr 文字列の日
	 * @return java.util.Dateクラス
	 */
	public static String toDateFormatStr(String yearStr, String monthStr, String dayStr) {
		int year = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr) - 1;
		int date = Integer.parseInt(dayStr);

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
		return form.format(cal.getTime());
	}

	public static String toFormatedString(Date date) {
		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
		return form.format(date);
	}
}

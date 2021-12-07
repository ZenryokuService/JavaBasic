package ysg.tkm.tutorial;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("現在日時：" + now);

		Calendar cal = Calendar.getInstance();
		Date now2 = cal.getTime();
		System.out.println("現在日時2：" + now2);

		cal.set(Calendar.YEAR, 2020);
		System.out.println("set YEAR：" + cal.getTime());
		cal.set(Calendar.MONTH, 5);
		System.out.println("set MONTH = 5：" + cal.getTime());
		cal.set(Calendar.MONTH, 4);
		System.out.println("set MONTH = 4：" + cal.getTime());
		cal.set(Calendar.DAY_OF_MONTH, 31);
		System.out.println("set DAY_OF_MONTH = 31：" + cal.getTime());

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date sample = cal.getTime();
		String formatedDate1 = format.format(sample);
		System.out.println("フォーマット：" + formatedDate1);

		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:dd");
		String formatedDate2 = format2.format(sample);
		System.out.println("フォーマット：" + formatedDate2);

	}
}

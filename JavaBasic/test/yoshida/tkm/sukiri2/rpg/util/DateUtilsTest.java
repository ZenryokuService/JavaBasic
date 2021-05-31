package yoshida.tkm.sukiri2.rpg.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author 作成者の名前
 * 2021/05/22
 */
public class DateUtilsTest {

	@Test
	public void testDate() {
		assertEquals("1980/03/28", DateUtils.toDateFormatStr("1980", "3", "28"));
		assertEquals("1980/03/28", DateUtils.toDateFormatStr("1980", "03", "28"));
		assertEquals("2010/02/02", DateUtils.toDateFormatStr("2010", "2", "2"));
	}
}

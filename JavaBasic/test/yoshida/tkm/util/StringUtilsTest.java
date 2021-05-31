package yoshida.tkm.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * StringUtilsのテスト用のクラス
 * @author 作成者の名前
 * 2021/05/27
 */
public class StringUtilsTest {
	@Test
	public void testStringUtils01() {
		StringUtils target = new StringUtils();
		 // 作成するメソッドの＜処理＞の１の内容を確認する処理
	    // assertEquals(想定する結果の値, 検証する値);
		assertEquals(StringUtils.EMPTY,  target.stringTest01("", null));
	}

	@Test
	public void testStringUtils02() {
		StringUtils target = new StringUtils();
		assertEquals(StringUtils.EQUAL, target.stringUtils02("aaa", "aaa"));
		assertEquals(StringUtils.ERROR, target.stringUtils02("aaa", "aab"));
		//assertEquals(StringUtils.ERROR, target.stringUtils02(null, "aab"));
		assertEquals(StringUtils.IGNORE, target.stringUtils03("aaa", "AAA"));
	}

	@Test
	public void testConvertUpper() {
		StringUtils target = new StringUtils();
		assertEquals("AAA", target.convertUpper("aaa"));
	}
	
	@Test
	public void testConvertLower() {
		StringUtils target = new StringUtils();
		assertEquals("testa", target.convertLower("TeStA"));
	}

	@Test
	public void testSubString() {
		StringUtils target = new StringUtils();
		// 0 < 3 -> [0] ~ [2]
		assertEquals("abc", target.subString("abcdefg", 0, 3));
		assertEquals("defg", target.subString("abcdefg", 3));
	}

	@Test
	public void testReplaceStr() {
		StringUtils target = new StringUtils();
		assertEquals("abあd", target.replaceStr("abcd", "c", "あ"));
	}

	@Test
	public void testRplaceAll() {
		StringUtils target = new StringUtils();
		assertEquals("ああああ", target.replaceAllStr("AbCd01234", "[a-zA-Z0-9]", "あ"));
	}

	@Test
	public void testDate01() {
		StringUtils target = new StringUtils();
		target.currentDate();
	}
}

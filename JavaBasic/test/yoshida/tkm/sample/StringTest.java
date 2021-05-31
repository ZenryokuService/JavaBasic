/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm.sample;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

/**
 *
 * @author 作成者の名前
 * 2021/05/18
 */
public class StringTest {

	@Test
	public void testHello() {
		System.out.println("Hello Test");
		String test = "aaa";
	
		assertEquals(false, test.equals("aab"));
		assertEquals(true, test.equals("aaa"));
		assertEquals("AAA", test.toUpperCase());
		assertEquals("testa", "TEstA".toLowerCase());
		assertEquals(1, "Tesea".indexOf("e"));
		assertEquals(0, "Tesea".indexOf("T"));
		assertEquals(1, "Takashimaya".indexOf("a"));
		assertEquals(3, "Tesea".lastIndexOf("e"));
		assertEquals(10, "Takashimaya".lastIndexOf("a"));
		assertEquals(true, "Takashimaya".contains("aya"));
		assertEquals(true, "Takashimaya".contains("shim"));
		assertEquals(false, "Takashimaya".contains("Aya"));

		assertEquals("abc", "abcdefg".substring(0, 3));
		assertEquals("efg", "abcdefg".substring(4));
		assertEquals("defg", "abcdefg".substring(3, 7));
		
		assertEquals("abc", " abc ".trim());
		assertEquals("ab c", " ab c ".trim());

		assertEquals("abあda", "abcda".replace("c", "あ"));
		assertEquals("あbcdあ", "abcda".replace("a", "あ"));

		assertEquals("ああああABCD", "abcdABCD".replaceAll("[a-z]", "あ"));
		assertEquals("ああああ1234ああああ", "abcd1234ABCD".replaceAll("[a-zA-Z]", "あ"));
		
		assertEquals("abcdああああABCD", "abcd1234ABCD".replaceAll("[0-9]", "あ"));
		assertEquals("abcdああああABCD", "abcd0123ABCD".replaceAll("[0-9]", "あ"));

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date date = format.parse("2021/05/27");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void list1_1() {
		System.out.println("*** リスト1-1 ***");
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		if (s2.equals(s3)) {
			System.out.println("s2とs3は同じ");
		}

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ同じ(等しい)");
		}
	
		System.out.println("s1の長さは" + s1.length());
	}

	@Test
	public void list1_2() {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでおります");
		}

		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Java末尾にあります");
		}

		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		
	}

	@Test
	public void list1_3() {
		// 1. 書き写して実行 教科書の28p リスト1-3
		String s1 = "Java programing";
		/// のちの処理を書き動かす。
		// 2. 文字列の左から５番目はスペースになることを確認する処理(assertEquls())を実装してください。
		
	}
}

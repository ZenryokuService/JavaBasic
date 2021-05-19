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

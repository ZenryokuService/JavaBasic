/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm.sukiri2.rpg.check;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 作成者の名前
 * 2021/05/16
 */
public class CheckerUtilsTest {

	@BeforeClass
	public static void init() {
	}

	@Test
	public void testIsEmpty() {
		assertEquals(false, CheckerUtils.isEmpty("aaa"));
		assertEquals(true, CheckerUtils.isEmpty(""));
		assertEquals(true, CheckerUtils.isEmpty(null));
	}

	@Test
	public void testIsFixLength() {
		String test1 = "123";
		String test2 = "1234";
		String test3 = "1234567";
		String test4 = "12345678";

		assertEquals(false, CheckerUtils.isFixLength(test1, 4, 7));
		assertEquals(true, CheckerUtils.isFixLength(test2, 4, 7));
		assertEquals(true, CheckerUtils.isFixLength(test3, 4, 7));
		assertEquals(false, CheckerUtils.isFixLength(test4, 4, 7));
	}

	@Test
	public void testIsFixRange() {
		assertEquals(false, CheckerUtils.isFixRange(3, 4, 7, true));

		assertEquals(true, CheckerUtils.isFixRange(4, 4, 7, true));
		assertEquals(false, CheckerUtils.isFixRange(4, 4, 7, false));

		assertEquals(true, CheckerUtils.isFixRange(6, 4, 7, true));
		assertEquals(true, CheckerUtils.isFixRange(6, 4, 7, false));

		assertEquals(true, CheckerUtils.isFixRange(7, 4, 7, true));
		assertEquals(false, CheckerUtils.isFixRange(7, 4, 7, false));

		assertEquals(false, CheckerUtils.isFixRange(8, 4, 7, false));
	}

	@Test
	public void testIsNumber() {
		assertEquals(true, CheckerUtils.isNumber("12", "2", "4", true));
		assertEquals(true, CheckerUtils.isNumber("12", "2", "4", false));

		assertEquals(true, CheckerUtils.isNumber("1234", "2", "4", true));
		assertEquals(true, CheckerUtils.isNumber("1234", "2", "4", false));

		assertEquals(false, CheckerUtils.isNumber("12345", "2", "4", true));
		assertEquals(false, CheckerUtils.isNumber("12345", "2", "4", false));
	}

	@Test
	public void testIsEqual(String strA, String strB) {
		assertEquals(true, CheckerUtils.isEquals("test", "test"));
		assertEquals(false, CheckerUtils.isEquals("test", "tist"));
	}
}

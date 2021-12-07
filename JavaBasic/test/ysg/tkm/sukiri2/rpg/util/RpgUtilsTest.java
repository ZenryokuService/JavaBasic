/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package ysg.tkm.sukiri2.rpg.util;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author 作成者の名前
 */
public class RpgUtilsTest {
	/** テスト対象 */
	private static RpgUtils target;
	/** 標準入力 */
	private static Scanner scan;
	
	@BeforeClass
	public static void init() {
		scan = new Scanner(System.in);
		target = new RpgUtils();
		
	}

	@Test
	public void testCreateName() {


		//assertEquals("", target.isFixLength());
	}
}

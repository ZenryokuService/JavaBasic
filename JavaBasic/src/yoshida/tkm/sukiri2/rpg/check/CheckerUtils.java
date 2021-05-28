/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm.sukiri2.rpg.check;

/**
 *
 * @author 作成者の名前
 * 2021/05/16
 */
public class CheckerUtils {

	/**
	 * 入力値が数字かどうか判定する
	 *
	 * @param input 入力文字列
	 * @return 数字の入力の場合はtrue
	 */
	public static boolean isNumber(String input, String low, String high, boolean isRequired) {
		boolean isNumber = false;

		if (isRequired && isEmpty(input)) {
			return false;
		}
		if (input.matches("[0-9]{" + low + "," + high + "}")) {
			isNumber = true;
		}
		return isNumber;
	}
	/**
	 * 入力文字列が"1"か"2"であればtrue
	 * @param input 入力文字列
	 * @return 入力文字列が"1"か"2"であればtrue
	 */
	public static boolean is1_2(String input) {
		boolean is1_2 = false;
		if ("1".equals(input) || "2".equals(input)) {
			is1_2 = true;
		}
		return is1_2;
	}
	/**
	 * 入力文字列の下限、上限を指定してチェックを行う。
	 * @param input 入力文字列
	 * @param lower 最低の入力文字数
	 * @param higher 最高の入力文字数
	 * @return 指定の範囲内にあればtrueを返す
	 */
	public static boolean isFixLength(String input, int lower, int higher) {
		boolean isFixLength = false;
		if (isEmpty(input)) {
			isFixLength = false;
		}
		if (input.length() >= lower && input.length() <= higher)  {
			isFixLength = true;
		}
		return isFixLength;
	}

	/**
	 * 入力値が指定の範囲にあるか判定
	 * @param input 入力値
	 * @param low 最低値
	 * @param high 最高値
	 * @param isContain 値を含むときはtrue
	 * @return 最低値〜最高値の範囲にあるかどうか
	 */
	public static boolean isFixRange(int input, int low, int high, boolean isContain) {
		boolean isFixRange = false;

		if (isContain) {
			isFixRange = input >= low && input <= high ? true : false;
		} else {
			isFixRange = input > low && input < high ? true : false;
		}
		return isFixRange;
	}
	/**
	 * 入力がnullまたはから文字の場合にtrueを返す
	 *
	 * @param input 入力文字列
	 * @return 入力がnullまたはから文字の場合にtrueを返す
	 */
	public static boolean isEmpty(String input) {
		if (input == null || "".equals(input)) {
			return true;
		}
		return false;
	}

	public static boolean isEqual(String strA, String strB) {
		if (strA == null || strB == null) {
			return false;
		}
		return strA.equals(strB);
	}
}

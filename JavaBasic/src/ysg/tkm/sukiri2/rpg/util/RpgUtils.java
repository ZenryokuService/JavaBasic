/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package ysg.tkm.sukiri2.rpg.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ysg.tkm.sukiri2.rpg.check.CheckerUtils;
import ysg.tkm.sukiri2.rpg.player.RpgHero;

/**
 *
 * @author 作成者の名前
 */
public class RpgUtils {
	/** 名前の作成 */
	public static String createName(Scanner scan) {
		String name = null;
		while (true) {
			scan.reset();
			name = scan.nextLine();
			if (CheckerUtils.isFixLength(name, 4, 7) == false) {
				System.out.println("文字数は, ４文字以上、７文字以内にしてください。");
				continue;
			}
			break;
		}
		return name;
	}

	/** 性別の作成 */
	public static int createSex(Scanner scan) {
		int sex = 0;
		while (true) {
			sex = 0;
			scan.reset();
			System.out.println("1: 男 2: 女 のいずれかを入力してください。");
			String input = scan.nextLine();
			if (CheckerUtils.is1_2(input)) {
				sex = Integer.parseInt(input);
				break;
			} else {
				System.out.println("指定した入力をしてください。\"1\"か\"2\"を入力してください。" + System.lineSeparator());
			}
		}
		return sex;
	}

	/** 年齢の作成 */
	public static int createAge(Scanner scan) {
		int age = 0;
		while (true) {
			age = 0;
			System.out.println("0-120までの数字を入力してください。");
			String input = scan.nextLine();
			if (input.matches("[0-9]{0,3}")) {
				age = Integer.parseInt(input);
				if (age > 120) {
					continue;
				}
				break;
			}
			scan.reset();
		}
		return age;
	}

	/** 誕生日 */
	public static Date createBirthDay(Scanner scan) {
		Date birthDay = null;
		scan.reset();

		return birthDay;
	}

	/**
	 * 勇者の作成を行う
	 */
	public static RpgHero createHero(Scanner scan) {
		// 名前の作成
		String name = RpgUtils.createName(scan);
		int sex = RpgUtils.createSex(scan);
		int age = RpgUtils.createAge(scan);
		Date birthDay = RpgUtils.createBirthDay(scan);

		 return new RpgHero(name, sex, age, birthDay);
	}

	public static void showStatus(RpgHero hero) {
		System.out.println("*** " + hero.getName() + " ***");
		System.out.println("年齢: " + hero.getAge());
		System.out.println("性別: " + (hero.getSex() == 1 ? "男" : "女"));
		System.out.println("誕生日: " + hero.getBirthDay());
	}

	public static String dateToString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return format.format(date);
	}

	public static Date dateToString(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date result = null;

		try {
			result = format.parse(date);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return result;
	}

}

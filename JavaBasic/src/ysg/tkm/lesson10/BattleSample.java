/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package ysg.tkm.lesson10;

/**
 *
 * @author 作成者の名前
 * 2021/05/23
 */
public class BattleSample {
	public static void main(String[] args) {
//		Hero hero = new Hero("勇者");
//		Slime slime = new Slime("スライムA");
//
//		hero.attack(slime);
//		slime.attack(hero);
		test01();
	}
	

	public static void test01() {
		Character[] party = new Character[2];
	    party[0] = new Hero("太郎");
	    party[1] = new Wizard("二郎");


	    System.out.println("こんにちは、良いパーティですね。");
	    for (int i = 0; i < party.length; i++) {
	        // ここの処理を変更する必要がある
	        System.out.println(party[i].getName() + "さん");
	    }
	}
}

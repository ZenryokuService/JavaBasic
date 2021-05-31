/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm.sukiri2.rpg.monster;

import yoshida.tkm.sukiri2.rpg.RpgCharacter;
/**
 *
 * @author 作成者の名前
 * 2021/05/24
 */
public abstract class Monster extends RpgCharacter {

	 public Monster(String name) {
		 super(name, -1, -1, "2020/02/02");
	 }
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param birthDay
	 */
	public Monster(String name, int sex, int age, String birthDay) {
		super(name, sex, age, birthDay);
		// TODO Auto-generated constructor stub
	}

	public void attack(Monster monst) {
	}

	public abstract void attack(RpgCharacter player);
}

/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm.lesson10.monster;

import yoshida.tkm.lesson10.Character;
import yoshida.tkm.lesson10.Monster;

/**
 *
 * @author 作成者の名前
 * 2021/05/24
 */
public class Slime extends Monster {

	/**
	 * @param name
	 */
	public Slime(String name) {
		super(name);

	}

	/* (non-Javadoc)
	 * @see yoshida.tkm.lesson10.Monster#attack(yoshida.tkm.lesson10.Character)
	 */
	@Override
	public void attack(Character player) {
		System.out.println(getName() + "の攻撃");
		System.out.println(player.getName()+ "に3ポイントのダメージ");
	}
	
}

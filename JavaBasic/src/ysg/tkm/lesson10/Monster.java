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
 * 2021/05/24
 */
public abstract class Monster extends Character {

	/**
	 * @param name
	 */
	public Monster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Monster m) {
	}

	public abstract void attack(Character player);
}

/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package yoshida.tkm;

/**
 *
 * @author 作成者の名前
 * 2021/05/17
 */
public class Sample2 {
	public static void main(String[] args) {
		// コンストラクタ
		Sample main = new Sample();
		main.hello();
		main.hello2();
		// クラスをnewしなくても呼び出せる
		Sample.get21();

		// セキュリティ的にアウト
//		main.setField_int(14);
//		main.hello("メッセージ" + main.getField_int());

//		// static呼び出し(後々に理解しましょう)
//		Sample.get21();
	}
}

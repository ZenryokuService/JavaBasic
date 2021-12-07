package ysg.tkm.sukiri2.rpg.player;

import ysg.tkm.sukiri2.rpg.RpgCharacter;

/**
 * 魔法使いクラス
 * @author 作成者の名前
 * 2021/05/22
 */
public class RpgWizard extends RpgCharacter {

	/**
	 * @param name
	 */
	public RpgWizard(String name) {
		super(name, 10, 2, "1999/12/12");
	}

	public RpgWizard(String name, int sex, int age, String birthDay) {
		super(name, sex, age, birthDay);
	}
	/* (non-Javadoc)
	 * @see yoshida.tkm.sukiri2.rpg.RpgCharacter#showMenu()
	 */
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see yoshida.tkm.sukiri2.rpg.RpgCharacter#attack(yoshida.tkm.sukiri2.rpg.RpgCharacter)
	 */
	@Override
	public void attack(RpgCharacter character) {
		// TODO Auto-generated method stub
		
	}
	
}

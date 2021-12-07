package ysg.tkm.lesson10;

/**
 *
 * @author 作成者の名前
 * 2021/05/19
 */
public class Matango extends Monster {

	public Matango(String name) {
		super(name);
		super.hp = 6;
	}

	@Override
	public void attack(Character player) {
		System.out.println(getName() + "の攻撃");
		player.setHp(player.getHp() - 3);
		System.out.println(player.getName()+ "に3ポイントのダメージ");
	}

}

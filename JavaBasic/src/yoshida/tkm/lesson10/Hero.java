package yoshida.tkm.lesson10;

/**
 *
 * @author 作成者の名前
 * 2021/05/19
 */
public class Hero extends Character {
	/** 定数 */
	final String TEISU = "定数";
//	String name = "ミナト";
//	int hp = 100;

	/** コンストラクタ */
	public Hero() {
		// newしたときに呼び出される
		System.out.println("*** Hero コンストラクタ ***");
	}

	/** 戦う */
	public void attack(Matango m) {
		System.out.println(getName() + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	/** 逃げる */
	public void run() {
		// コメント
		System.out.println(getName() + "は逃げ出した！");
	}
}

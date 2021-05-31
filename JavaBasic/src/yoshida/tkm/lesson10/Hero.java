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
	public Hero(String name) {
		super(name);
		super.hp = 10;
		String aa = this.TEAM;
		// 直接フィールドにアクセスするのは、セキュリティ的にアウト
		super.hh = 0;
		super.setHp(10);
		// newしたときに呼び出される
		System.out.println("*** Hero コンストラクタ ***");
	}

	public void attack(Matango m) {
		System.out.println(getName() + "の攻撃");
		m.setHp(m.getHp() - 5);
		System.out.println("5ポイントのダメージをあたえた！");
	}

	/** 逃げる */
	public void run() {
		// コメント
		System.out.println(getName() + "は逃げ出した！");
	}

	@Override
	public void attack(Monster m) {
		System.out.println(getName() + "の攻撃");
		System.out.println(m.getName()+ "に3ポイントのダメージ");
	}
}

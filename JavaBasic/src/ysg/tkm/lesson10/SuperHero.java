package ysg.tkm.lesson10;

/**
 * 【継承の書き方】
 * アクセス修飾子 class クラス名 extends クラス名 { ... }
 *
 * @author 作成者の名前
 * 2021/05/19
 */
public class SuperHero extends Hero {
	/** 飛んでいる */
	boolean flying;

	/** コンストラクタ */
	public SuperHero(String name) {
		// 親クラスのコンストラクタ
		super(name);
		// newしたときに呼び出される
		System.out.println("*** SuperHero コンストラクタ " + getName() + "***");
	}
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	/** オーバーライド */
	@Override
	public void run() {
		System.out.println(getName() + "は撤退した");
	}

	@Override
	public void attack(Monster m) {
		super.attack(m);
//		System.out.println(this.name + "の攻撃");
//		m.hp -= 5;
//		System.out.println("5ポイントのダメージをあたえた！");

		// 飛んでいるとき、追撃ができる
		if (this.flying) {
			System.out.println(getName() + "の追加攻撃!");
			m.hp -= 5;
			System.out.println("5ポイントの追加ダメージをあたえた！");
		}
	}
}

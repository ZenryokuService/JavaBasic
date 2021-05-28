package yoshida.tkm.lesson10;


/**
 *
 * @author 作成者の名前
 * 2021/05/19
 */
public  class Character {
	// java.lang.Character;
	protected String name;
	protected int hp;
	private int mp;

<<<<<<< HEAD
//	/** 抽象メソッド */
//	public abstract void attack(Matango m);
=======
	public Character(String name) {
		this.name = name;
	}
	/** 抽象メソッド */
	public abstract void attack(Monster m);
>>>>>>> 3dd3ee111010291f6b22230603982c472f2e9481

	public String toString() {
		return this.name + ": " + this.hp;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return the mp
	 */
	public int getMp() {
		return mp;
	}
	/**
	 * @param mp the mp to set
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}
}

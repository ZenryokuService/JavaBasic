package yoshida.tkm.sukiri2.rpg;


/**
 * RPG用のキャラクターを表すクラス。
 * 継承して各キャラクターを作成する。
 * 
 * @author 作成者の名前
 * 2021/05/22
 */
public abstract class RpgCharacter {
	/** 名前 */
	protected String name;
	/** HP */
	protected int hp;
	/** MP */
	protected int mp;
	/** 攻撃力 */
	protected int attackPower;
	/** 防御力 */
	protected int diffencePower;
	/** 性別 */
	protected int sex;
	/** 年齢 */
	protected int age;
	/** 誕生日 */
	protected String birthDay;


	/** 使用できるコマンドのメニューを開く */
	public abstract void showMenu();
	/** たたかう */
	public abstract void attack(RpgCharacter character);
	/** にげる */
	public void escape() {
		System.out.println(this.name + "は逃げ出した");
	}

	public RpgCharacter(String name) {
		this.name = name;
		this.hp = 10;
		this.mp = 0;
	}

	public RpgCharacter(String name, int sex, int age, String birthDay) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.birthDay = birthDay;
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
	/**
	 * @return the attackPower
	 */
	public int getAttackPower() {
		return attackPower;
	}
	/**
	 * @param attackPower the attackPower to set
	 */
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	/**
	 * @return the diffencePower
	 */
	public int getDiffencePower() {
		return diffencePower;
	}
	/**
	 * @param diffencePower the diffencePower to set
	 */
	public void setDiffencePower(int diffencePower) {
		this.diffencePower = diffencePower;
	}
	/**
	 * @param sex the sex to set
	 */
	public int getSex() {
		return this.sex;
	}	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

}

package yoshida.tkm;

/**
 * クラスの書き方
 * 1. クラスがプログラムを動かすための基準になります。
 * 2. クラスの中にかけるもの(クラスが持てるもの)
 * 
 * クラス：初めの文字を大文字
 * メソッド：初めの文字を小文字
 * @author 作成者の名前
 * 2021/05/17
 */
public class Sample {
	/** フィールド変数 */
	private int field_int = 0;
	private String field_String = "もじれる";
	//////// 注意(教科書の書き方はほぼ使わない) /////
	// String package_String = "使わない";

	/**
	 * ＜コンストラクタの書き方＞
	 * アクセス修飾子 クラス名(引数) { ... }
	 * 
	 * newした時の処理を書く
	 */
	public Sample() {
		this.field_int = 5;
		this.field_String = "aaaa時の値";	
	}

	/** オーバーロード */
	public Sample(int num, String str) {
		this.field_int = num;
		this.field_String = str;	
	}

	/**
	 * ハローメソッド
	 */
	public void hello() {
		System.out.println(this.field_String);
		this.hello("こんにちは、フィールド変数：" + this.field_int);
		this.hello2();
	}
	/**
	 * ハローメソッド
	 */
	public void hello2() {
		System.out.println(this.field_String);
		this.hello("こんにちは、フィールド変数：" + this.field_int);
	}

	/**
	 * @return the field_int
	 */
	// キャメルケース
	public int getField_int() {
		return field_int;
	}

	/**
	 * @param field_int the field_int to set
	 */
	public void setField_int(int field_int) {
		this.field_int = field_int;
	}

	/**
	 * @return the field_String
	 */
	public String getField_String() {
		return field_String;
	}

	/**
	 * @param field_String the field_String to set
	 */
	public void setField_String(String field_String) {
		this.field_String = field_String;
	}

	/**
	 * ハローメソッド(オーバーロード)
	 */
	public void hello(String message) {
		System.out.println(message);
	}

	/**
	 * ハローメソッド(オーバーロード)
	 */
	public void hello(int message) {
		System.out.println(message);
	}

	/**
	 * ハローメソッド(オーバーロード)
	 */
	public void hello(String message, int num) {
		System.out.println(message);
	}

//	/** エラーになるのでオーバーロードにならない。
//	 * ハローメソッド(オーバーロード)
//	 */
//	public int hello(String message) {
//		System.out.println(message);
//		return 0;
//	}

	public static void main(String[] args) {

		
	}

	/** スタティックメソッド */
	public static int get21() {
//		hello(); メンバメソッドはスタティックメソッドから直接呼び出せない
		Sample main = new Sample();
		// セキュリティ的にアウト
		main.field_int = 0;
		main.hello();
		main.hello("メッセージ");
		return 21;
	}

	public static void backup1() {
		System.out.println("Hello Main" + get21());
		Sample main = new Sample();
		main.setField_int(12);
		main.hello();
		main.hello("メッセージ");
	}
	public static void backup2() {
		Sample main = new Sample();
		main.hello();

		Sample main1 = new Sample(10, "オリンピックまであと。。。");
		main1.hello();
	}
}

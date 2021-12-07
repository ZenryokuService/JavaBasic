package ysg.tkm.tutorial;

import java.math.BigDecimal;

/**
 * Javaの基本文法。IDE=開発ツール
 * Hello Worldから、始めてメソッド呼び出しまでやる。
 *
 * 1. 【プログラムの書き方】
 * 1-1. メインメソッドとは？～ハローワールドの実装～
 * 1-2. 変数の扱い方～プリミティブ型の変数の扱い～
 * 1-3. 演算子の意味と使い方～算術演算子、比較演算子、代入演算子～
 * 2. 【配列の扱い方～配列の意味と通常の変数と配列変数との違い～】
 * 3.【IF文、SWITCH文の書き方】
 * 4.【ループ文 1.while 2. for】
 * 5. 【メソッドの扱い】
 */
public class BasicGrammar {

	/** メインメソッド */
	public static void main(String[] args) {
		System.out.println("*** Start Testing ***");
		BasicGrammar basic = new BasicGrammar();
		basic.menberBak1();

		// メソッドの書き方
		int result = basic.menberBak2(1, 2);
		System.out.println("返り値：" + result);

		String result2 = basic.menberBak2("1", "2");
		System.out.println("返り値A：" + result2);

	}

	/**
	 * メンバメソッド
	 */
	public void menberBak1() {
		System.out.println("Hello Member");
	}

	/** メソッド */
	public int menberBak2() {
		return 2;
	}

	/** オーバーロード */
	public int menberBak2(int num1, int num2) {
		return num1 + num2;
	}

	/** メソッド */
	public String menberBak2(String str, String str2) {
		return str + str2;
	}

	/**
	 * メソッド
	 * アクセス修飾子：	public
	 * static：なくてもよいもの
	 * 返り値(戻り値)：void (なし)
	 * 引数：なし
	 */
	public static void bak1() {
		//// プリミティブ型 ////
		// 変数＝データを入れつためのハコ(メモリ領域)
		// 初期化：「int型の変数numberを0で初期化」
		int number = 0;
		// 宣言：値はセットしない
		int num;
		System.out.println(number + 1);
		double shosu = 0.0;
		// 真偽値 = true / false;
		boolean isTrue = true;
		boolean isFalse = false;

		// numberという変数の値が0と等しい
		isTrue = number == 0;
		// numberという変数の値が0と等しくない
		isFalse = number != 0;

		// 論理値＝isTrue => number == 0 // ture
		if (isTrue == false) {
			System.out.println("isTrue");
		} else {
			System.out.println("not isTrue");
		}
		//// 参照型・クラス型 ////
		// 文字列型
		String str;
		String str2 = "aaa";
		System.out.println(str2);
	}

	public static void bak2() {
		// 演算子の種類：算術演算子・比較演算子・代入演算子

		// ==算術演算子==
		int tashizan = 1 + 1;
		int hikizan = 2 - 1;
		int kakezan = 2 * 2;
		int warizan = 3 / 2;
		double wari1 = 3 / 2;
		BigDecimal big = new BigDecimal(3);

		System.out.println("足し算：" + tashizan);
		System.out.println("引き算：" + hikizan);
		System.out.println("かけ算：" + kakezan);
		System.out.println("わり算：" + warizan);
		// 計算結果が間違っている(2進数)
		System.out.println("わり算1：" + wari1);
		System.out.println("わり算2：" + big.divide(new BigDecimal(2)));

		System.out.println("*** 比較演算子 ***");
		// ==比較演算子==
		// 等しいかどうか比較する(数値の比較)
		boolean isSame = 1 == 1;
		System.out.println("isSame: " + isSame);
		boolean notSame = 1 != 1;
		System.out.println("notSame: " + notSame);
		// 0を含めない比較(数値の比較)
		boolean isBig = 1 > 1;
		System.out.println("isBig A: " + isBig);
		// 0を含める比較(数値の比較)
		isBig = 1 >= 1;
		System.out.println("isBig B: " + isBig);

		// 比較演算子ではないが。。。
		isSame = "ああ".equals("ああ");
		System.out.println("バイト数「aa」:" + "あ牛".getBytes().length);
		// "" => 文字列はStringクラスのこと、比較はメソッドを使う
		System.out.println("isSame C: " + isSame);
	}
	public static void testArray() {
		/////// int型の変数 //////////
		// int型の変数～宣言～
		int num0;
		// int型の変数～初期化～
		int num = 0;

		// int型の配列変数、書き方１～要素の中身を初期化する
		int[] numArr = new int[] {0, 1, 2, 3};
		System.out.println("要素数A：" + numArr.length);
		System.out.println("0番目の要素を表示：" + numArr[0]);
		System.out.println("1番目の要素を表示：" + numArr[1]);
		System.out.println("2番目の要素を表示：" + numArr[2]);
		System.out.println("2番目の要素を表示：" + numArr[3]);
		// numArr.length - 1 = 要素の番号の最大値
		// numArr.length = 要素の数

		// int型の配列変数、書き方２
		int[] numArr2 = new int[3];// 0 => デフォルト値
		System.out.println("要素数B：" + numArr2.length);
		double[] dArr = new double[] {0.0, 0.1, 0.2};

		float[] fArr = new float[] {0.1f, 0.2f, 0.3f};
		long[] lngArr = new long[] {0L, 1L};

		/////// String型の変数 //////////
		// String型の変数～宣言～
		String str0;
		// String型の変数～初期化～
		String str = "";
		// String型の配列変数、書き方１～要素の中身を初期化する
		String[] strArr = new String[] {"0", "1", "2"};
		// String型の配列変数、書き方２
		String[] strArr2 = new String[3];
	}

	public static void bak3() {
		// if文
		int num = 0;
		boolean isBoolean = 1 >= 1;
		if (isBoolean) {
			System.out.println("IF文");
		} else if (isBoolean && num == 0) {
			// true && ture => true;以外はfalse
			// AND演算
			System.out.println("ELSE IF文1");
		} else if (isBoolean || num == 1) {
			// false && false => false;以外はtrue
			// OR演算
			System.out.println("ELSE IF文2");
		} else {
			System.out.println("ELSE文");
		}
	}

	public static void bak4() {
		String input = "";// -> からもじ(空文字)
		switch (input) {
		case "1":
			System.out.println("ケース１");
			break;
		case "2":
			System.out.println("ケース２");
			break;
		case "3":
			System.out.println("ケース３");
			break;
		default:
			System.out.println("ケースデフォルト");
		}
	}

	public static void bak5() {
		int[] arr = new int[] {0,3,1,2};
		for (int i = 0; i < arr.length - 1; i++) {
			int tmp = arr[i];
			int hikaku = arr[i + 1];// エラー
			if (tmp < hikaku) {
				arr[i] = hikaku;
				arr[i + 1] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}

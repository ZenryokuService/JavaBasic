package yoshida.uml.chap7;

import yoshida.uml.Shohin;

public class Chap7Main {

	/**
	 * Javaメインメソッドが動く
	 * @param args プログラム引数
	 */
	public static void main(String[] args) {
		// 各クラスのフィールドに値を設定して表示する
		// 商品コード、商品名などは任意で決めてよいです
		// 【使用不可】Shohin s = new Shohin("aa", "kk");
		Phone phone = new Phone("A-123", "アン", 1200);
		System.out.println("1: " + phone);
		phone.setShohinCd("A-124");
		phone.setShohinName("インド");
		phone.setValue(10000);
		phone.setViewSize(23);
		System.out.println("2: " + phone);

		Degicame cam = new Degicame("B-223", "でじ", 2300);
		System.out.println("3: " + cam);
		cam.setShohinCd("B-234");
		cam.setShohinName("アメリカ");
		cam.setValue(10001);
		System.out.println("4: " + cam);
		cam.setGaso(555);
		System.out.println("5: " + cam);

		KeitaiAudio aud
			= new KeitaiAudio("C-009", "携帯オーディオ", 12000);
		aud.setShohinCd("C-010");

		System.out.println("*** Testing ***");
		// 配列としてまとめることができる
		// 親クラス型の変数で子クラスを使用する、こともできる。
		Shohin[] sh = new Shohin[] {phone,cam, aud};
		System.out.println("len: " + sh.length);
		for (Shohin s : sh) {
			System.out.println(s.toString());
		}
	}
}

package yoshida.uml;

public class Shohin {

	/** #商品コード */
	protected String shohinCd;
	/** #商品名 */
	protected String shohinName;
	/** #価格 */
	protected int value;

	/**
	 * コンストラクタ。
	 * このクラスのインスタンスを作るときに、各値を設定する。
	 *
	 * @param shohinCd
	 * @param shohinName
	 * @param value
	 */
	protected Shohin(String shohinCd, String shohinName, int value) {
		// 引数をフィールド変数にセット
		this.shohinCd = shohinCd;
		this.shohinName = shohinName;
		this.value = value;
	}

	/** オーバーロード */
	protected Shohin(String shohinCd, String shohinName) {
		// 引数をフィールド変数にセット
		this.shohinCd = shohinCd;
		this.shohinName = shohinName;
		this.value = 100;
	}

	//// Getter Setter ////

	public String getShohinCd() {
		return shohinCd;
	}
	public void setShohinCd(String shohinCd) {
		this.shohinCd = shohinCd;
	}
	public String getShohinName() {
		return shohinName;
	}
	public void setShohinName(String shohinName) {
		this.shohinName = shohinName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("商品コード：" + this.getShohinCd());
		b.append(" ");
		b.append("商品名：" + this.shohinName);
		b.append(" ");
		b.append("価格：" + this.value);

		return b.toString();
	}


}

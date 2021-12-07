package yoshida.uml.chap7;

import yoshida.uml.Shohin;

/** 携帯電話クラス */
public class Phone extends Shohin{
	/** -液晶サイズ */
	private int viewSize;

	/** コンストラクタ */
	public Phone(String shohinCd, String shohinName, int value) {
		// 親クラスのコンストラクタを呼び出している
		super(shohinCd, shohinName, value);
	}

	public int getViewSize() {
		return viewSize;
	}

	public void setViewSize(int viewSize) {
		this.viewSize = viewSize;
	}

	@Override
	public String toString() {
		// 親クラスのtoString()を実行
		String superText = super.toString();
		String returnText = superText + " 液晶サイズ: " + viewSize;
		//String returnText = superText + getViewSize();
		return returnText;
	}

	@Override // 上書き
	public String getShohinCd() {// シグニチャ
		return "P_" + super.getShohinCd();
	}

}

package yoshida.uml.chap7;

import yoshida.uml.Shohin;

/** デジカメクラス */
public class Degicame extends Shohin{
	/** -画素数 */
	private int gaso;

	public Degicame(String shohinCd, String shohinName, int value) {
		super(shohinCd, shohinName, value);
	}

	public int getGaso() {
		return gaso;
	}

	public void setGaso(int gaso) {
		this.gaso = gaso;
	}

	@Override
	public String toString() {
		String superText = super.toString();
		return superText + " 画素数: " + this.gaso;
	}

}

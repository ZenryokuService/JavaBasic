package yoshida.uml.chap7;

import yoshida.uml.Shohin;

public class KeitaiAudio extends Shohin{
	/** -容量 */
	private int yoryo;

	public KeitaiAudio(String shohinCd, String shohinName, int value) {
		super(shohinCd, shohinName, value);
	}

	public int getYoryo() {
		return yoryo;
	}

	public void setYoryo(int yoryo) {
		this.yoryo = yoryo;
	}


}

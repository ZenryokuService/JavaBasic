package ysg.tkm.sukiri2.rpg.story;

import ysg.tkm.sukiri2.rpg.player.RpgHero;
import ysg.tkm.sukiri2.rpg.util.RpgUtils;


/**
 * テキストROGのストーリー部分を実行する
 * 1. 勇者作成のシーン
 *
 * 作成者の名前
 */
public class RpgStory {
	/** 王様 */
	private static final String KING = "王様: ";

	/** 改行コード */
	private static final String SEP = System.lineSeparator();

	public RpgStory() {
	}

	/**
	 * ゲーム開始時。初めの文章表示を行う。
	 */
	public void firstScene() {
		System.out.println("****************************");
		System.out.println("** TextRPG is Starting ... *");
		System.out.println("****************************" + SEP);

		System.out.println(KING + "よく来てくれた！　まずは、名前を教えてくれないか？");
	}

	public void secondScene(RpgHero hero) {
		System.out.println(KING + "おお！" + hero.getName() + "というのか、予言の通りぢゃ!");
		RpgUtils.showStatus(hero);
	}

	
}

package yoshida.tkm.sukiri2.mains;

import java.util.Scanner;

import yoshida.tkm.sukiri1.frw.CommandIF;
import yoshida.tkm.sukiri2.rpg.player.RpgHero;
import yoshida.tkm.sukiri2.rpg.story.RpgStory;
import yoshida.tkm.sukiri2.rpg.util.RpgUtils;



/**
 * すっきりJavaの学習として、テキストRPGを作成する。
 *
 * @author 作成者の名前
 */
public class TextRpg implements CommandIF {
	/** 標準入力 */
	private Scanner scan;
	/** ストーリークラス */
	private RpgStory story;

	public TextRpg() {
		System.setProperty("file.encoding", "UTF-8");
		scan = new Scanner(System.in);
		story = new RpgStory();
	}

	/** テキストROG実行処理 */
	@Override
	public void execute() {
		// テキストORGを開始する
		story.firstScene();

		// 勇者の作成
		RpgHero hero = RpgUtils.createHero(scan);
		// 勇者の作成後
		story.secondScene(hero);
	}

}

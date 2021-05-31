package yoshida.tkm.sukiri2.mains;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import yoshida.tkm.sukiri1.frw.CommandIF;

/**
 *
 * @author 作成者の名前
 * 2021/05/26
 */
public class SampleRpg1 {
	/** CommandIFを実装したクラスを保持 */
	private static Map<String, Class<CommandIF>> clsMap;

	private static final boolean isDebug = true;

	public static void main(String[] args) {
	}

	private void main1() {
		SampleRpg1 main = new SampleRpg1();
		main.loadProperties("mains.properties");
		Set<String> set = clsMap.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String val = (String) it.next();
			if (val.equals("abc")) {
				System.out.println("想定通り!");
			}
			System.out.println(val);
		}
	}
	private void loadProperties(String fileName) {
		Properties prop = new Properties();
		clsMap = new HashMap<>();
		try {
			Path path = Paths.get("resources", fileName);

			if (isDebug) System.out.println("Path: " + path.getParent().toString() + "\\" + fileName);

			BufferedReader buf = Files.newBufferedReader(path);
			prop.load(buf);
			System.out.println(prop.get("rpg"));
		} catch (IOException ie) {
			System.out.println(fileName + "の読み込み時にエラーがありました。");
			ie.printStackTrace();
			System.exit(-1);
		}
		if (isDebug) System.out.println("propLength: " + prop.size());

		prop.keySet().stream().forEach(key-> {
			// key = 実行クラスの番号
			String className = prop.getProperty(key.toString());
			try {
				Class<CommandIF> klass = (Class<CommandIF>) Class.forName(className);
				clsMap.put(key.toString(), klass);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
		});

		if (clsMap.size() == 0) {
			System.out.println("プロパティファイルにクラスが登録されていません。");
			System.exit(-1);
		}
 	}
}

package ysg.tkm.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author 作成者の名前
 * 2021/05/25
 */
public class First {
	public static void main(String[] args) {
		Path path = Paths.get("resources", "mains.properties");
		try {
			BufferedReader read = Files.newBufferedReader(path);
			String line = null;
			while((line = read.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
			System.exit(-1);
		}
	}
}

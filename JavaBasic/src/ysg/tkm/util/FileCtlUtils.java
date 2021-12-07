package ysg.tkm.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * ファイルコントロール用ユーティリティクラス.
 */
public class FileCtlUtils {

    /**
     * 引数のファイルを読み込む
     * @param fileName resources以下にあるファイル
     * @return BufferedReader 読み込んだ結果
     * @throws IOException
     */
    public static BufferedReader fileRead(String fileName) throws IOException {
        Path file = Paths.get("resources", fileName);

        BufferedReader buf = null;
        try {
            buf = Files.newBufferedReader(file);
        } catch (IOException e) {
            throw e;
        }
        if (buf == null) {
            throw new IOException("ファイルが読み込めませんでした。：" + file.toString());
        }
        return buf;
    }

}

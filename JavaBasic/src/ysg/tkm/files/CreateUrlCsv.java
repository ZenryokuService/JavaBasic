package ysg.tkm.files;

import ysg.tkm.util.FileCtlUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 日本のローカル情報特化型検索エンジン。
 */
public class CreateUrlCsv {
    /** 都道府県町村リスト */
    private Map<Integer, String[]> todohuList;

    public CreateUrlCsv() {
        todohuList = new HashMap<Integer, String[]>();
    }

    /**
     * 1. 検索処理を行うための処理、検索範囲を指定するURLリストの作成を行う
     * @param args
     */
    public static void main(String[] args) {
        CreateUrlCsv main = new CreateUrlCsv();
        try {
            // A. 47都道府県の一覧取得
            BufferedReader buf = FileCtlUtils.fileRead("zenkoku.csv");
            // B. 全国の都道府県市町村名を一覧


        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

    }

    /**
     * 都道府県町村リストを作成する。
     * @param buf
     */
    public void createTodohuList(BufferedReader buf) {

    }

}

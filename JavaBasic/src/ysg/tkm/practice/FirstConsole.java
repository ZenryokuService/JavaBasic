package ysg.tkm.practice;

import java.util.Scanner;

/**
 * 標準入力を使用したアプリケーションを作る。
 */
public class FirstConsole {
    /** メインメソッド */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // このメソッドで1行分のデータ(入力)を受け取る
        String input = scan.nextLine();
        // 受け取った値を表示する
        System.out.println("「" + input + "」と入力しました。");

        //  next()はスペース区切りで値を受け取る
        String first = scan.next();
        String second = scan.next();
        System.out.println("1: " + first );
        System.out.println("2: " + second );

        // 2回目、変数を使い回しています。
        first = scan.next();
        second = scan.next();
        System.out.println("1: " + first );
        System.out.println("2: " + second );

    }
}

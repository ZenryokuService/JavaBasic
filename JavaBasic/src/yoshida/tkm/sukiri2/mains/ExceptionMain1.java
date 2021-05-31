package yoshida.tkm.sukiri2.mains;

import yoshida.tkm.lesson10.Hero;
import yoshida.tkm.lesson10.Matango;
import yoshida.tkm.lesson10.Wizard;
import yoshida.tkm.lesson10.Character;
import yoshida.tkm.lesson17.HeroExceptiion;
import yoshida.tkm.lesson17.OriginalException;

/**
 *
 * @author 作成者の名前
 * 2021/05/26
 */
public class ExceptionMain1 {
	public static void main(String[] args) {
		ExceptionMain1 main = new ExceptionMain1();
		main.hello();

		Character ex = new Hero("aaa");
		Character ex1 = new Wizard("avv");
		Character che = new Matango("ab");
		
		if (che instanceof Wizard) {
			System.out.println("****Wizard****");
		} else if (ex1 instanceof Hero) {
			System.out.println("***Hero****");
		}
		test();
		
	}

	/** インスタンスメソッド */
	public void hello() {
		System.out.println("Hello World");
	}

	public void test01() {
		hello();
	}
	public static void test() {
		String message = null;
		try {
			message = loadString("bye");
			System.out.println(message);
		} catch (Exception e) {
			int a = 0;
			char ch = 'a';
			double d = 1.2;

			// プリミティブ型
			if ( a <= a) {
				
			} else if ("234".equals("234")) {
				// クラス型(参照型)
				boolean isEmptyStr = "".equals("");
			}
			if (e instanceof OriginalException) {
				
			}
			if (e instanceof OriginalException) {
				System.out.println("オリジン！");
			} else {
				System.out.println("Exception!");
			}
			e.printStackTrace();		
		} finally {
			System.out.println("メッセージは：" + message);
		}	}
	/**
	 * 
	 * @param mes
	 * @return 文字列
	 * @throws Exception
	 */
	public static String loadString(String mes) throws Exception {
		// mesが「bye」という値の時に例外を投げる
		if ("bye".equals(mes)) {
			throw new Exception("さよならは言わないで");
		}
		if ("aaa".equals(mes)) {
			throw new OriginalException("オリジナルの例外");
		}
		return mes;
	}
}

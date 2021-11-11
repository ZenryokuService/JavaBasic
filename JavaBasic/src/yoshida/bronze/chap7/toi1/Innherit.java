package yoshida.bronze.chap7.toi1;

/** 継承関係をこのファイルのみで再現する */
public class Innherit extends C_{

	public void test() {
		this.methodA();
		this.methodB();
		this.methodC();
	}

	public static void main(String[] args) {
		Innherit main = new Innherit();
		main.test();
	}
}

class A_ {
	public void methodA() {
		System.out.println("A");
	}
}

class B_ extends A_{
	public void methodB() {
		System.out.println("B");
	}
}

class C_ extends B_{
	public void methodC() {
		System.out.println("C");
	}
}
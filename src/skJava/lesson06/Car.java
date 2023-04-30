package skJava.lesson06;

public class Car {
	
	//フィールド
	int num;   //車両No.
	double gas;//ガソリン量
	
	public void setNum(int num) {
		this.num = num;
	}
	
	//メソッド(振る舞い)
	public void show() {
		System.out.println("車両No.は" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		
	}
	

}

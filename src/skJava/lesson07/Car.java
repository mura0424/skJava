package skJava.lesson07;

public class Car {
	
	//フィールド
	private int num;     //車両No.
	private double gas;  //ガソリン量
	
	//デフォルトコンストラクタ(記載しなくても良い)
	//オーバーロードをした場合は、明記しないといけない。
	public Car() {}
	//コンストラクタのオーバーロード
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
		
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	//セッター	
	public void setCar(int num) {
		this.num = num;
	}
	
	//セッター
	public void setCar(double gas) {
		if (gas > 0) this.gas = gas;
	}
	
	//ゲッター
	public int getNum() {
		return num;
	}
	
	//ゲッター
	public double getGas() {
		return gas;
	}
	
	//メソッド(振る舞い)
	public void show() {
		System.out.println("車両No.は" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		
	}
	

}

package skJava.lesson06;

public class Car {
	
	//フィールド
	int num;   //車両No.
	double gas;//ガソリン量
	
	public void setNumGas(int num, double gas) {
		this.num = num;
		this.gas = gas;
	}
	//セッター	
	public void setNum(int num) {
		this.num = num;
	}
	
	//セッター
	public void setGas(double gas) {
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

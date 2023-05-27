package skJava.lesson09;

//車クラス
public class Car {
	
	//private int num;
	//private double gas;
	
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	//オーバーロード
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーが" + num + "\nガソリン量が" + gas + "\nの車を作成しました。");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "\nガソリン量を" + gas + "\nに設定しました。");
	}
	
	public void show() {
		System.out.println("車のナンバー：" + num);
		System.out.println("ガソリン量：" + gas);
	}
	
	@Override
	public String toString() {
		return "こめ！";
	}

}

package skJava.lesson06;

public class Sample01 {
	public static void main(String[] args) {
		
		Car car;
		//インスタンス化
		car = new Car();
		
		//Carクラスのフィールドに値を設定
		car.num = 1185;
		car.gas = 1.6;
		
		System.out.println("車両No.は" + car.num + "です。");
		System.out.println("ガソリン量は" + car.gas + "です。");
	}

}

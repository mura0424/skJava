package skJava.lesson06;

public class Sample06 {
	public static void main(String[] args) {
		
		Car car1;
		Car car2;
		//インスタンス化
		car1 = new Car();
		car2 = new Car();
		//Carクラスのフィールドに値を設定
		car1.setNum(1185);
		car1.setGas(1.6);
		car2.setNumGas(1192, 65.3);

		
		System.out.println("車両No.は" + car1.getNum() + "です。");
		System.out.println("ガソリン量は" + car1.getGas() + "です。");
		
		System.out.println();
		
		System.out.println("車両No.は" + car2.getNum() + "です。");
		System.out.println("ガソリン量は" + car2.getGas() + "です。");

	
	}

}

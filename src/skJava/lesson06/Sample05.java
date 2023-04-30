package skJava.lesson06;

public class Sample05 {
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

		
		car1.show();
		System.out.println();
		car2.show();
	
	}

}

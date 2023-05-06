package skJava.lesson07;

public class Sample01 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		//オーバーロード
		car1.setCar(5678);
		car1.setCar(-123.4);
		
		car1.show();
		
		System.out.println();
		
		Car car2 = new Car(1234,567.8);
		car2.show();
	}

}

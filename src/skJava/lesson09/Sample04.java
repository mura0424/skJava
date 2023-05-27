package skJava.lesson09;

public class Sample04 {
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[2];
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		int n = 0;
		for (Car car : cars) {
			
			System.out.println((n + 1) + "番目のクラスは" + car.getClass() + "です。");
			
		}
	}

}

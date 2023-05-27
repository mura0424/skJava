package skJava.lesson08;

public class Sample05 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.Show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		Num(number);
		Name(str);
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		System.out.println();
		
		car1.Show();
	}
	
	public static void Num(int number) {
		number = 5678;
		System.out.println(number);
	}
	
	public static void Name(String name) {
		name = "2号車";
	}

}

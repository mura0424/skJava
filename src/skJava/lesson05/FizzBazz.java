package skJava.lesson05;
/*1から順番に数字を言っていき、
 * 3で割り切れる数字はfizz、
 * 5で割り切れる数字はbazz、
 * 3.5両方で割り切れる数字はfizzbazzといっていく遊びです
 */
public class FizzBazz {
	public void fizzbazz() {
		//1～15
		for(int i = 1; i < 16; i++) {
			System.out.print(i + ":");
			if( i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("fizzbazz");	
			}else if( i % 5 == 0 ){
				System.out.println("bazz");
			}else if( i % 3 == 0) {
				System.out.println("fizz");
			}
		}
			}
			/*
			if( i % 3 == 0) {
				System.out.println("fizz");	
			}else if( i % 5 == 0 ){
				System.out.println("bazz");
			}else if( i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("fizzbazz");
			}
			*/
           
			//先生の解答	
				public void fizzbazz_先生() {
					
					// 1～15までのループ
					for (int i = 1; i <= 15; i++) {
						// 現在の i の値を出力
						System.out.print(i + "：");
						// 3で割り切れたらFizz
						if (i % 3 == 0)
							System.out.print("Fizz");

						// 5で割り切れたらBazz
						if (i % 5 == 0)
							System.out.print("Bazz");
						
						// 改行
						System.out.println();
					}
				
	}

}

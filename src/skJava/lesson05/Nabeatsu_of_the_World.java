package skJava.lesson05;
/*条件
 * 10進数を渡すと2進数にしてreturnで返す（int型）
 * mainでstringでうける。ナベアツの前に
 * 2進数にするクラスは別で作る。
 * 
 * 10進数を引き数として渡す（入力しなくていい）
 * 文字型に入れて返す
 * mainで出す
 * 
 * 3が付く数字か3で割れる数
 */

import java.util.Scanner;

public class Nabeatsu_of_the_World {
	public void notw() {
		
		String finalResult="" ;
		
		System.out.println("数字を入力してください");
		Scanner inputValue = new Scanner(System.in);
		int inputResult = inputValue.nextInt();
		
		
		String binary = new Binary().binary(inputResult);
		
		System.out.println(binary);
		//入力内容を数値に変換
		int i = Integer.parseInt(binary,2);
		int y = i % 3 ;
		
		//3が含まれているか
		if(binary.contains("3")) {
			finalResult = inputResult + "!!!";
			System.out.println(finalResult);
		//3で割れるか
		}else if (y == 0) {
			finalResult = inputResult + "!!!";
			System.out.println(finalResult);
		}else {
			System.out.println("入力されたのは「" + inputResult + "」です。");
		}
		
		//scanner閉じる
		inputValue.close();		
	}

}

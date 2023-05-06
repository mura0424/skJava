package skJava.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample02 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("半角英字を入力してください");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("大文字に変換すると" + str.toUpperCase() + "です。");
		System.out.println("小文字に変換すると" + str.toLowerCase() + "です。");
	}

}

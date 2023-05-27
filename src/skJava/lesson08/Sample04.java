package skJava.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample04 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.print("文字を入力して下さい：");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer(br.readLine());
		//暗黙的にtoStringがされている（sb.toString()）
		System.out.print("入力した文字は「" + sb.toString() + "」です。");
		System.out.println();
		
		System.out.print("追加したい文字を入力してください：");
		
		sb.append(br.readLine());
		
		System.out.println("追加後の文字は「" + sb + "」です。");
	}

}

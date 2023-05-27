package skJava.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample03 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.print("文字を入力して下さい：");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		System.out.println();
		
		System.out.print("検索したい文字を入力してください：");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		//何番名いるか
		int num = str1.indexOf(ch);
		
		if (num != -1) {
			System.out.print(str1 + "の" + (num + 1) + "番目に「" + ch + "」が見つかりました。");
		}else {
			System.out.println(str1 + "に「" + ch + "」はありません。");
		}
	}

}

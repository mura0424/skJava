package skJava.lesson08;

public class Sample01 {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		
		System.out.println(str + "の1番目の文字は" + ch1 + "です。");
		System.out.println(str + "の2番目の文字は" + ch2 + "です。");
		System.out.println(str + "の文字数は" + len + "です。");
		
	}

}

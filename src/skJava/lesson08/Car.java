package skJava.lesson08;

public class Car {
	
	//フィールド
	private int num;
	private double gas;
	private String name;
	
	//コンストラクター
	public Car() {
		num = 0;
		gas = 0.0;
		name = "名無し";
		
		System.out.println("車を作りました。");
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー：" + num + "\nガソリン量：" + gas );
		System.out.println("に設定しました。");
	}
	
	public void setName(String nm) {
		name = nm;
		System.out.println("名前を「" + name + "」にしました。");
	}
	
	public void Show() {
		System.out.println("車のナンバーは" + num);
		System.out.println("ガソリン量は" + gas);
		System.out.println("名前は" + name);
		System.out.println("です。");
	}

}

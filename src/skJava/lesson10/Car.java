package skJava.lesson10;

//車クラス
public class Car implements iVehicle, iMaterial{
	
	private int num;
	private double gas;
	
	public Car(int num, double gas) {
		
		this.num = num;
		this.gas = gas;
		System.out.println("ナンバー；" + num);
		System.out.println("ガソリン量；" + gas);
		System.out.println("車を作成しました。");
	}

	@Override
	public void vShow() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
//		System.out.println("スピードは" + speed + "です。");
		
	}
	
	@Override
	public void mShow() {
		System.out.println("車の材料は鉄です。");
		
	}

}

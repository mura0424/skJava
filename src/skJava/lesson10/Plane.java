package skJava.lesson10;

//飛行機クラス
public class Plane implements iVehicle{
	
	private int flight;
	
	public Plane(int flight) {
		this.flight = flight;
		System.out.println("便" + this.flight + "の飛行機を作成しました。");
	}

	@Override
	public void vShow() {
		System.out.println("飛行機の便は" + flight + "です。");
//		System.out.println("スピードは" + speed + "です。");
		
	}
	
	

}

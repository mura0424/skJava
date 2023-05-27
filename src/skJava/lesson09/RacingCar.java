package skJava.lesson09;

//レーシングカークラス
public class RacingCar extends Car{
	
	private int course; //コース
	
	//コンストラクタ
	public RacingCar() {
		//super(); 隠れている
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	//オーバーロード
	public RacingCar(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
		
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("コースを" + course + "にしました。");
	}
	
	@Override
	public void show() {
		System.out.println("レーシングカーのナンバーは" + num);
		System.out.println("ガソリン量は" + gas);
		System.out.println("コースは" + course);
	}

}

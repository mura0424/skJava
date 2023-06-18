package skJava.lesson10;

//乗り物クラス(Vehicleは車両という意味)
public abstract class Vehicle {
	
	//フィールド
	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("速度を" + speed + "にしました。");
	}
	
	abstract void show();

}

package week2.day1;

public class Car {
	public void driveCar() {
		System.out.println("DriveCar");
	}
	public void applyBrake() {
		System.out.println("Brake applied");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	public void isPuncture() {
		System.out.println("Punctured");
	}
public static void main(String[] args) {
	Car car=new Car();
	car.applyBrake();
	car.driveCar();
	car.soundHorn();
	car.isPuncture();
}
}

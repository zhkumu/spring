package test;

public class CarFactory {
	public static Car getCar(){
		return new Car("mycar", "this is car", 123, "static");
	}
}

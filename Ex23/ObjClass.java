public class ObjClass {
	public static void main(String args[]) {
		Vehicle v = new Vehicle(2000.5, "Black");
		
		System.out.println(v.weight);
		System.out.println(v.color);
	}
}

class Vehicle {
	double weight;
	String color;
	
	Vehicle(double d, String c) {
		this.weight = d;
		this.color = c;
	}
}

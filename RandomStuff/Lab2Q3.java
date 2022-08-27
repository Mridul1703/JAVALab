public class Lab2Q3 {
	public static void main(String args[]) {
		float a = 10.5f, b = 5.0f;
		Area A = new Area();
		A.getdata(a, b);
		float c = A.c * A.d;
		System.out.println(c);
	}

}

class Area {
	float c, d;
	void getdata(float a, float b) {
		c = a;
		d = b;
	}
}

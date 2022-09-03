public class AccessPvt
{
	public static void main(String[] args) {
		  Two o = new Two();
		  System.out.println(o.n);
	}
}

class One {
    private int n = 6;
}

class Two extends One {
    int x = 4;
}

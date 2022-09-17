public class Five1 {
    public static void main(String[] args) {
        ToTestInt tti = new ToTestInt();
        System.out.println(tti.sq);
    }
}

interface test {
    public int square(int n);
}

class Arithmetic implements test {
    public int square(int n) {
        return n*n;
    }
}

class ToTestInt {
    Arithmetic a = new Arithmetic();
    int sq = a.square(5);
}
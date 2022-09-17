public class Five3 {
    public static void main(String[] args) {
        First f = new First();
        int ret = f.consval();
        System.out.println(ret);
    }
}

interface One {
    int constt = 5;
    public int consval();
}

class First implements One {
    public int consval() {
        constt = 10;
        return constt;
    }
}
public class Five4 {
    public static void main(String[] args) {
        ImplementTwoMethods itm = new ImplementTwoMethods();
        int a = itm.div(10);
        int b = itm.mod(20);

        Second sc = new Second();
        int c = sc.div(100);
        int d = sc.mod(50);

        System.out.println("Super class: "+a+" "+b);
        System.out.println("Sub class: "+c+" "+d);
    }
}

interface TwoMethode {
    public int div(int n);
    public int mod(int n);
}

class ImplementTwoMethods implements TwoMethode {
    public int div(int  d) {
        return d/2;
    }

    public int mod(int m) {
        return m%2;
    }
}

class Second extends ImplementTwoMethods {
    @Override
    public int div(int d) {
        return d/4;
    } 

    @Override
    public int mod(int m) {
        return m%4;
    }
}
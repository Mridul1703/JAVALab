public class Five2 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.meth1();
        mc.meth2();
    }
}

interface A {
    public void meth1();
    public void meth2();
}

class MyClass implements A {
    public void meth1() {
        System.out.println("Method 1");
    }

    public void meth2() {
        System.out.println("Method 2");
    }
}
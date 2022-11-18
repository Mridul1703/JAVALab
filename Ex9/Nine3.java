public class Nine3 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("Initially: " + count);

        Increment i = new Increment();

        Thread1 t1 = new Thread1(i);
        t1.run();

        Thread2 t2 = new Thread2(i);
        t2.run();

        Thread3 t3 = new Thread3(i);
        t3.run();

        Thread4 t4 = new Thread4(i);
        t4.run();

        Thread5 t5 = new Thread5(i);
        t5.run();
    }
}

class Increment {
    synchronized void increase() {
        Nine3.count++;
        System.out.println(Nine3.count);
    }
}

class Thread1 extends Thread {
    Increment i1;

    Thread1(Increment i) {
        i1 = i; 
    }

    public void run() {
        i1.increase();
    }
}

class Thread2 extends Thread {
    Increment i2;

    Thread2(Increment i) {
        i2 = i; 
    }

    public void run() {
        i2.increase();
    }
}

class Thread3 extends Thread {
    Increment i3;

    Thread3(Increment i) {
        i3 = i; 
    }

    public void run() {
        i3.increase();
    }
}

class Thread4 extends Thread {
    Increment i4;

    Thread4(Increment i) {
        i4 = i; 
    }

    public void run() {
        i4.increase();
    }
}

class Thread5 extends Thread {
    Increment i5;

    Thread5(Increment i) {
        i5 = i; 
    }

    public void run() {
        i5.increase();
    }
}
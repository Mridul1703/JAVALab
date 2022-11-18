public class Nine2 {
    public static void main(String[] args) {
        ThreadTwo t2 = new ThreadTwo();
        t2.run();

        ThreadOne t1 = new ThreadOne();
        t1.run();
    }
}

class ThreadOne extends Thread {
    public void run() {
        for(int i=0; i<11; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
            for(int i=0; i<11; i++) {
                if(i%2 != 0) {
                    System.out.println(i);
                }
            }
        }
}

public class Nine1 {
    public static void main(String[] args) {
        Threading t = new Threading();
        t.run();
    }
}

class Threading extends Thread {
    public void run() {
        System.out.println("Thread works fine!");
    }
}
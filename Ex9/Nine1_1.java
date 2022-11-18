import javax.sound.sampled.SourceDataLine;

public class Nine1_1 {
    public static void main(String[] args) {
        RunInt ri = new RunInt();
        ri.run();
    }
}

class RunInt implements Runnable {
    public void run() {
        System.out.println("Runnable works fine!");
    }
}

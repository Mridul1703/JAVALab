public class Seven4 {
    public static void main(String[] args) {
        try{
            add(args[0], args[1]);
        } catch(Exception e) {
            System.out.println("\t!tAlphanumeric value!");
        }
    }
    
    static void add(String x, String y) throws Exception {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int sum = a+b;
    
        System.out.println("Sum: "+sum);
    }
}


public class OptimizedPrimeFactorization implements Runnable{
    private Thread t;
    private final int targetNumber;

    public OptimizedPrimeFactorization(int targetNumber){
        this.targetNumber = targetNumber;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization");
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(targetNumber); i++) {
            if (targetNumber % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(targetNumber + " is a Prime number - Optimized");
        } else {
            System.out.println(targetNumber + " is not a Prime number - Optimized");
        }
    }
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

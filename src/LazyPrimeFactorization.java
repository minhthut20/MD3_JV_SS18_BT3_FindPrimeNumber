public class LazyPrimeFactorization implements Runnable{
    private Thread t;
    private int targetNumber;

    public LazyPrimeFactorization(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization");
        try {
            boolean flag = true;
            for (int i = 2; i < targetNumber; i++) {
                if (targetNumber % i == 0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(targetNumber + " is a Prime number - Lazy");
            } else {
                System.out.println(targetNumber + " is not a Prime number - Lazy");
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

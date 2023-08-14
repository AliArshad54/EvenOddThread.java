public class EvenOddThread extends Thread {
    private final int val;
    public EvenOddThread(String name , int value) {
        super(name);
        this.val = value;
    }

    @Override   
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= val; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            System.out.println(" \nMessage from  " + threadName);
        }
    }

    public static void main(String[] args) {
        int valueInRange = 1000;
        EvenOddThread thread1 = new EvenOddThread("T1",valueInRange);
        EvenOddThread thread2 = new EvenOddThread("T2",valueInRange);
        thread1.start();
        thread2.start();

    }
}

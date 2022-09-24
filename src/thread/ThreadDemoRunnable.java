package thread;

public class ThreadDemoRunnable implements Runnable{
    private int i;
    ThreadDemoRunnable(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        for (; i < 10 ; i++)
            System.out.println("Thread " + Thread.currentThread().getName() + " " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MainClass {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemoRunnable th1 = new ThreadDemoRunnable(1);
        ThreadDemoRunnable th2 = new ThreadDemoRunnable(1);
        Thread thread1 = new Thread(th1);
        Thread thread2 = new Thread(th2);
        thread1.start();
        thread1.join();
        thread2.start();
    }
}

package thread;

public class ThreadDemo extends Thread{
    private int i;
    ThreadDemo(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Thread " + i);
    }

}
class Main{
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo th = new ThreadDemo(1);
        ThreadDemo th1 = new ThreadDemo(2);
        ThreadDemo th2 = new ThreadDemo(3);
        th.start();
        th1.start();
        th1.join();
        th2.start();

    }
}

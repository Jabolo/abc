public class Main {

    public static void main(String[] args) throws InterruptedException {
       Thread w0 = new MyThread(0);
       Thread w1 = new MyThread(1);
       w0.start();
       w1.start();
       w0.join();
       w1.join();

    }
}

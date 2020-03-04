public class MyThread extends Thread {
    public static int K[] = new int[2];
    public static int czyja_kolej;
    int id;
    public void run ()
    {
        int me = id;
        int other = (id+1)%2;
        for (int i = 0; i < 10; i++) {

            K[me] = 0;
            czyja_kolej = other;
            while (K[other] == 0 && czyja_kolej == other) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("w" + getName() + ": kom1");
            System.out.println("w" + getName() + ": kom2");
            System.out.println("w" + getName() + ": kom3");
            K[me] = 1;
        }

    }
    public MyThread(int id)
    {
        super(Integer.toString(id));
        this.id = id;
    }


}

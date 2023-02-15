class workers implements Runnable{
    public void run(){
        for (int i = 0; i <= 20; i++){
            System.out.println("Thread one is working");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class worker2 implements Runnable{
    public void run(){
        for (int i = 0; i <= 20; i++){
            System.out.println("Thread two is working");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Threads_2 {
    Thread t1, t2;
    Threads_2(){
        t1 = new Thread(new workers());
        t2 = new Thread(new worker2());

        t1.setPriority(5);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new Threads_2();
    }
}

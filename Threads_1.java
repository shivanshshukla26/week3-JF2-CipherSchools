class worker extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Thread 1 running ..."+ new java.util.Date());

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Threads_1 {
    public static void main(String[] args) {
        worker w1 = new worker();
        w1.start();
    }
}

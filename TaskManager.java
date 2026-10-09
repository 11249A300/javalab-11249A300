class Counter extends Thread{
    public void run() {
        for (int i =1 ; i <= 100;i++){
            System.out.println(i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class TaskManager {
    public static void main (String[] args) {
        Counter t = new Counter();
        t.start();
    }
}

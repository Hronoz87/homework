package Thread;

public class MyThread  extends Thread{

    public MyThread(ThreadGroup mainGroup, String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я поток номер" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.println(" Пока я спал, меня остановили!");
            return;
        } finally{
            System.out.printf("%s завершен\n", getName());
        }

    }
}

package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        final Thread thread = new MyThread(mainGroup, " 1");
        final Thread thread2 = new MyThread(mainGroup, " 2");
        final Thread thread3 = new MyThread(mainGroup, " 3");
        final Thread thread4 = new MyThread(mainGroup," 4");

        System.out.println("Создаю потоки");

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

//        mainGroup.interrupt();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {}

        thread.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();

    }
}

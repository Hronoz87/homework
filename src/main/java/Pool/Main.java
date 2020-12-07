package Pool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable();
        Callable<Integer> callable1 = new MyCallable();
        Callable<Integer> callable2 = new MyCallable();
        Callable<Integer> callable3 = new MyCallable();

        final ExecutorService threadPool = Executors.newFixedThreadPool(4);


        final Future<Integer> task = threadPool.submit(callable);
        final Future<Integer> task1 = threadPool.submit(callable1);
        final Future<Integer> task2= threadPool.submit(callable2);
        final Future<Integer> task3 = threadPool.submit(callable3);

        final Integer resultOfTask = task.get() + task1.get() + task2.get() + task3.get();

        threadPool.shutdown();
        System.out.println("Результат выполнения равен = " + resultOfTask);
    }
}

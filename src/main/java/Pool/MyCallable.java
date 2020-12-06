package Pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(2500);
        System.out.println("Привет!");
        System.out.println("Я " + Thread.currentThread().getName());
        System.out.println("Досвидания");
        return Thread.currentThread().getName();
    }
}

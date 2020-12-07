package Pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Привет!");
            System.out.println("Я " + Thread.currentThread().getName());
            System.out.println("Досвидания");
            Thread.sleep(2500);
            count = count + 3;
        } return count;

    }
}

package concurrent;

import java.util.concurrent.Callable;

/**
 * @author lyh
 * @date 2019/10/17 0017
 **/
public class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getClass().getName());
        return 123;
    }
}

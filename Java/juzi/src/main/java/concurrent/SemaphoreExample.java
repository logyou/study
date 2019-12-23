package concurrent;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author lyh
 * @date 2019/10/19 0019
 **/
public class SemaphoreExample {
    public static void main(String[] args) {
        final int clientCount = 3;
        final int totalRequestCount = 10;
        Semaphore semaphore = new Semaphore(clientCount, true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalRequestCount; i++) {
            final int num = i + 1;
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(new Date() + "： 服务号 " + num + " 受理业务中...");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(new Date() + "： 服务号 " + num + " 离开");
                    semaphore.release();
                }
            });
        }
        executorService.shutdown();
    }
}

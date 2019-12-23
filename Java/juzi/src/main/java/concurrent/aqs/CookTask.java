package concurrent.aqs;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lyh
 * @date 2019/10/18 0018
 **/
public class CookTask {
    public static void main(String[] args) {
        System.out.println(new Date() + "：开始准备材料，各自出发！");
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Cook(countDownLatch, "张三买菜"));
        executorService.execute(new Cook(countDownLatch, "李四买锅"));
        executorService.execute(new Cook(countDownLatch, "王五买米"));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + "：材料准备齐全，开始做饭！");
        executorService.shutdown();
    }
}

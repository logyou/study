package concurrent.aqs;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author lyh
 * @date 2019/10/18 0018
 **/
public class Cook implements Runnable {
    private CountDownLatch countDownLatch;
    private String action;

    public Cook(CountDownLatch countDownLatch, String action) {
        this.countDownLatch = countDownLatch;
        this.action = action;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((1 + new Random().nextInt(5)) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + "：完成 " + action);
        countDownLatch.countDown();
    }
}

package concurrent.aqs;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * @author lyh
 * @date 2019/10/18 0018
 **/
public class Travel implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private String action;

    public Travel(CyclicBarrier cyclicBarrier, String action) {
        this.cyclicBarrier = cyclicBarrier;
        this.action = action;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((1 + new Random().nextInt(5)) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + "：" + action + " 到达集合点");
        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + "：" + action + " 开始参观");
    }
}

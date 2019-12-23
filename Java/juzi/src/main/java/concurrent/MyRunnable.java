package concurrent;

import java.util.Date;

/**
 * @author lyh
 * @date 2019/10/17 0017
 **/
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println(this.getClass().getName() + ">" + new Date());
    }
}

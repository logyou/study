package concurrent.aqs;

import java.util.Date;
import java.util.Random;

/**
 * @author lyh
 * @date 2019/10/18 0018
 **/
public class Guide implements Runnable {

    @Override
    public void run() {
        System.out.println(new Date() + "：导游在集合点讲解注意事项，讲解完后各自自由参观！");
        try {
            Thread.sleep((1 + new Random().nextInt(5)) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package concurrent;

/**
 * @author lyh
 * @date 2019/10/17 0017
 **/
public class MyThread extends Thread {
    private Integer num;

    public MyThread(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getClass().getName() + ">" + num);
    }
}

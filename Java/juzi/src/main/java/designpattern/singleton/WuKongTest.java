package designpattern.singleton;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class WuKongTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> WuKong.getInstance().show()).start();
        }
    }
}

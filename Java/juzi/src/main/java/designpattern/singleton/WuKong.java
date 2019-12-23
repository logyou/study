package designpattern.singleton;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class WuKong {
    private volatile static WuKong wuKong;

    private WuKong() {
    }

    public static WuKong getInstance() {
        if (wuKong == null) {
            synchronized (WuKong.class) {
                if (wuKong == null) {
                    wuKong = new WuKong();
                }
            }
        }
        return wuKong;
    }

    public void show() {
        System.out.println(this.toString() + "：没错！我就是独一无二的悟空！");
    }
}

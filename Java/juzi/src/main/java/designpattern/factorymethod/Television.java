package designpattern.factorymethod;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class Television extends ElectronicProduct {
    @Override
    public void show() {
        System.out.println("我就是环球牌电视！");
    }
}

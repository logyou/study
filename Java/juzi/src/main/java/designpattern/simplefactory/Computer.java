package designpattern.simplefactory;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class Computer extends ElectronicProduct {
    @Override
    void show() {
        System.out.println("我就是环球牌电脑！");
    }
}

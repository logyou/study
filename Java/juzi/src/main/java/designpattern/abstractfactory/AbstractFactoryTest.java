package designpattern.abstractfactory;

/**
 * @author lyh
 * @date 2019/11/17 0017
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.createCellphone().show();
        xiaomiFactory.createComputer().show();

        AppleFactory appleFactory = new AppleFactory();
        appleFactory.createCellphone().show();
        appleFactory.createComputer().show();
    }
}

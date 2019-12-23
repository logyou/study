package designpattern.simplefactory;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class UniversalFactoryTest {
    public static void main(String[] args) {
        UniversalFactory.manufacture("Cellphone").show();
        UniversalFactory.manufacture("Television").show();
        UniversalFactory.manufacture("Computer").show();
    }
}

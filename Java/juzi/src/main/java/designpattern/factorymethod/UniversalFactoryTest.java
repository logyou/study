package designpattern.factorymethod;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class UniversalFactoryTest {
    public static void main(String[] args) {
        new CellphoneFactory().manufacture().show();
        new TelevisionFactory().manufacture().show();
        new ComputerFactory().manufacture().show();
    }
}

package designpattern.factorymethod;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class CellphoneFactory extends ElectronicFactory {
    @Override
    public ElectronicProduct manufacture() {
        return new Cellphone();
    }
}

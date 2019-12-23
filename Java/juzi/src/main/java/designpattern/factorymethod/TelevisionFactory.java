package designpattern.factorymethod;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class TelevisionFactory extends ElectronicFactory {
    @Override
    public ElectronicProduct manufacture() {
        return new Television();
    }
}

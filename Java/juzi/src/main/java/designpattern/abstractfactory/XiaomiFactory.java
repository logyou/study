package designpattern.abstractfactory;

/**
 * @author lyh
 * @date 2019/11/17 0017
 **/
public class XiaomiFactory extends Factory {
    @Override
    public Cellphone createCellphone() {
        return new XiaomiCellphone();
    }

    @Override
    public Computer createComputer() {
        return new XiaomiComputer();
    }
}

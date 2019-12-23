package designpattern.abstractfactory;

/**
 * @author lyh
 * @date 2019/11/17 0017
 **/
public class AppleFactory extends Factory {
    @Override
    public Cellphone createCellphone() {
        return new AppleCellphone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}

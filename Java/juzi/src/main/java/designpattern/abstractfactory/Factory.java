package designpattern.abstractfactory;

/**
 * @author lyh
 * @date 2019/11/17 0017
 **/
public abstract class Factory {
    public abstract Cellphone createCellphone();

    public abstract Computer createComputer();
}

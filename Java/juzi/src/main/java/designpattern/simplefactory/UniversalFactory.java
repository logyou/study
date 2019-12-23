package designpattern.simplefactory;

/**
 * @author lyh
 * @date 2019/11/16 0016
 **/
public class UniversalFactory {
    public static ElectronicProduct manufacture(String e) {
        switch (e) {
            case "Cellphone":
                return new Cellphone();
            case "Computer":
                return new Computer();
            case "Television":
                return new Television();
            default:
                return null;
        }
    }
}

import java.util.Arrays;

/**
 * @author lyh
 * @date 2019/10/13 0013
 **/
public class Test1 {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        String[] list = {"liu", "zhang ", "li", "zhao", "wang ", "sun", "zhou", "shi", "xie", "xiong ", "xia", "zhu"};
        Arrays.sort(list);
        Arrays.stream(list).forEach(System.out::println);
    }
}
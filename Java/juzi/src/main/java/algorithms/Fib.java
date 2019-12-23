package algorithms;

import java.util.HashMap;

/**
 * @author lyh
 * @date 2019/10/26 0026
 **/
public class Fib {
    private static long count1 = 0;
    private static long count2 = 0;
    private static long count3 = 0;

    private static long f1(int n) {
        count1++;
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else {
            return f1(n - 1) + f1(n - 2);
        }
    }

    private static long f2(int n) {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, 0L);
        map.put(1, 1L);
        return memo(map, n);
    }

    private static long memo(HashMap<Integer, Long> map, int n) {
        count2++;
        if (!map.containsKey(n)) {
            map.put(n, memo(map, n - 1) + memo(map, n - 2));
        }
        return map.get(n);
    }

    private static long f3(int n) {
        if (n < 2) {
            return n;
        }
        long prev = 0, curr = 1;
        for (int i = 0; i < n - 1; i++) {
            long sum = prev + curr;
            prev = curr;
            curr = sum;
            count3++;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("计算结果\t循环次数");
        System.out.println("----------------------");
        System.out.println(f1(n) + "\t\t" + count1);
        System.out.println("----------------------");
        System.out.println(f2(n) + "\t\t" + count2);
        System.out.println("----------------------");
        System.out.println(f3(n) + "\t\t" + count3);
    }
}

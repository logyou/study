package algorithms;

import java.util.Arrays;

/**
 * @author lyh
 * @date 2019/10/29 0029
 **/
public class Coin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int count = coinChange(coins, amount);
        System.out.println(count);
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] map = new int[max];
        Arrays.fill(map, max);
        map[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && (map[i - coin] + 1) < map[i]) {
                    map[i] = map[i - coin] + 1;
                }
            }
        }
        return map[amount] == max ? -1 : map[amount];
    }
}

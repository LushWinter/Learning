package algorithm.leetcode;

import java.util.Arrays;

/**
 * Description：TODO
 *
 * @author Leon
 * Date：2022/7/12 4:36 下午
 */
public class P2335 {

    public int fillCups(int[] amount) {
        int i = 0;
        while (true) {
            Arrays.sort(amount);
            if (amount[1] > 0 && amount[2] > 0) {
                amount[1]--;
                amount[2]--;
                i++;
            } else if (amount[2] > 0) {
                i = i + amount[2];
                break;
            }

        }

        return i;
    }
}

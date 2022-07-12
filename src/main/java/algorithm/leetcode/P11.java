package algorithm.leetcode;

/**
 * Description：TODO
 *
 * @author Leon
 * Date：2022/7/12 1:42 下午
 */
public class P11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        if (height.length <= 1) {
            return maxArea;
        }

        int start = 0;
        int end = height.length - 1;
        while (start <= end) {
            int high = height[end] > height[start] ? height[start] : height[end];

            int curArea = (end - start) * high;
            if (curArea > maxArea) {
                maxArea = curArea;
            }

            if (height[end] > height[start]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}

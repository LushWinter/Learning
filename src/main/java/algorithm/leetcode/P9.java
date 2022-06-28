package algorithm.leetcode;

public class P9 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNum = 0;
        while (x >= revertNum) {
            revertNum = x % 10 + revertNum * 10;
            x = x / 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}

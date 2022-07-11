public class Valid_Perfect_Square {
    public static void main(String[] args) {
        // int num = 16; //true
        int num = 14; // false

        boolean op = isPerfectSquare(num);
        System.out.println("op : " + op);
    }

    //Fastest solution
    public static boolean isPerfectSquare(int num) {
        long start = 1, end = num / 2;
        if (num == 1) {
            return true;
        }
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    // if you want to use shortcut methods like
    //  Link : https:// leetcode.com/problems/valid-perfect-square/discuss/83907/3-4-short-lines-Integer-Newton-Most-Languages
}

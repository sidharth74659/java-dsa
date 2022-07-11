public class Arranging_Coins {
    public static void main(String[] args) {
        // int n = 5; //2
        int n = 8; // 3

        int op = arrangeCoins(n);
        System.out.println("op : " + op);
    }

    public static int arrangeCoins(int n) {
        long start = 1, end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return (int) mid;
            } else if (sum > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) end;
    }

    // another approach
    public static int arrangeCoins(int n) {
        int res = 0;
        for (res = 1; res <= n; res++)
            n = n - res;
        return res - 1;
    }

    // Fastest solution
    public static int arrangeCoins(int n) {
        long left = 1, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long t = (mid * (mid + 1)) / 2;

            if (t > n)
                right = mid - 1;
            else if (t <= n)
                left = mid + 1;
        }

        if (left == right)
            return (int) left;

        return (int) right;
    }
}

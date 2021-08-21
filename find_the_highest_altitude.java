public class find_the_highest_altitude {
    public static void main(String[] args) {
        // int[] gain = { -5, 1, 5, 0, -7 };
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };

        int op = largestAltitude(gain);
        System.out.println("output : " + op);

    }

    public static int largestAltitude(int[] gain) {
        int[] op = new int[gain.length+1];
        int max = 0;
        for (int i = 1; i < op.length; i++) {
            op[i] = op[i - 1] + gain[i - 1];
            if (op[i] > max) {
                max = op[i];
            } 
        }

        return max;

    }
}

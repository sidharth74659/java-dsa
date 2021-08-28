public class richest_customer_wealth {

    public static void main(String[] args) {

        // int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } }; //6
        // int[][] accounts = { { 1,5 }, { 7,3 },{3,5} }; //10
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }; // 17

        int op = maximumWealth(accounts);
        System.out.println("op : " + op);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int row = 0; row < accounts.length; row++) {
            int count = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                count += accounts[row][col];
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}

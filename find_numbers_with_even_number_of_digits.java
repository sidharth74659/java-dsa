public class find_numbers_with_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        // int[] nums = { 555, 901, 482, 1771 };
        // int[] nums = { 580,317,640,957,718,764 };

        int op = findNumbers(nums);
        System.out.println("output : " + op);
    }

    public static int findNumbers(int[] nums) {
        int no = 0;
        for (int i : nums) {
            int count = 0;
            while (i > 0) {
                i = i / 10;
                count++;
            }
            if (count % 2 == 0) {
                no++;
            }
        }

        return no;

    }
}

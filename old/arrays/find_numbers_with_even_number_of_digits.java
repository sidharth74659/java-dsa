public class find_numbers_with_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 }; //2
        // int[] nums = { 555, 901, 482, 1771 };    //1

        int op = findNumbers(nums);
        System.out.println("output : " + op);
    }

    //Fast solution - 96%
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

    //Fastest solution - the if condition is based on constraints
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // using Math.log10() you can solvw this problem and also uisng string function
            // int a=(int)Math.log10(num);
            // if((a+1)%2==0)count++;
            if (num > 9 && num < 100 || num > 999 && num < 10000 || num > 99999 && num < 1000000)
                count++;
        }
        return count;
    }
}

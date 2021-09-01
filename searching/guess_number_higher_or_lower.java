public class guess_number_higher_or_lower extends GuessGame {

    public static void main(String[] args) {
        int n = 10; // setPick(6);
        setPick(6);

        // int n = 1; //setPick(1);
        // int n = 2; //setPick(1);
        // int n = 2; //setPick(2);

        int op = guessNumber(n);

        if (op == getPick())
            System.out.println("op : " + op);
        else
            System.out.println("output is not same as pick");

    }
    
    //Fastest solution
    public static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = guess(mid);
            if (ans < 0)
                end = mid - 1;
            else if (ans > 0)
                start = mid + 1;
            else
                return mid;
        }

        return 0;
    }

}

class GuessGame {
    static int value_of_pick = 0;

    static void setPick(int p) {
        if (p < 0) {
            value_of_pick = 0;
        } else {
            value_of_pick = p;
        }
    }

    static int getPick() {
        return value_of_pick;
    }

    static int guess(int num) {
        int pick = getPick();

        if (pick < num)
            return -1;
        else if (pick > num)
            return 1;
        else
            return 0;
    }

}

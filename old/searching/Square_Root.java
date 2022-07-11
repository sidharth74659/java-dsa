class Square_Root {
    public static void main(String[] args) {
        // int x = 4; // 2
        // int x = 8; //2
        int x = -24; // 4

        int op = mySqrt(x);
        System.out.println("op : " + op);
    }

    static int mySqrt(int x) {
        int start = 1;
        int end = x;
        if (x ==0) {
            return 0;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                end = mid - 1; // check the left part
            } else {
                start = mid + 1; // check the right part
            }
        }

        return start;
    }

    // // using Binary Search(can anyone help me out how this solution works)
    // static int mySqrt(int x) {
    // if (x == 0)
    // return 0;
    // int start = 1, end = x;
    // while (start < end) {
    // int mid = start + (end - start) / 2;
    // if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
    // return mid;
    // else if (mid > x / mid)// Keep checking the left part
    // end = mid;
    // else
    // start = mid + 1;// Keep checking the right part
    // }
    // return start;
    // }

    // // I still don't understand this
    // static int mySqrt(int x) {
    // long r = x;
    // while (r * r > x) {
    // r = (r + x / r) / 2;
    // }
    // return (int) r;
    // }

}

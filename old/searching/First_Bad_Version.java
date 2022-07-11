public class First_Bad_Version extends VersionControl {
    public static void main(String[] args) {

        int n = 5;
        setBadVersion(4);

        // int n = 1; //setBadVersion(1);

        int op = firstBadVersion(n);

        if (op == getBadVersion())
            System.out.println("op : " + op);
        else
            System.out.println("output is not the first BadVersion");
    }

    public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid - 1)) {
                    return mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    //Better Solution
    public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) 
                start = mid + 1;
            else 
                end = mid;
        }
        return start;
    }
}

class VersionControl {

    static int value_of_BadVersion = 0;

    static void setBadVersion(int p) {
        value_of_BadVersion = p < 0 ? 0 : p;
    }

    static int getBadVersion() {
        return value_of_BadVersion;
    }

    static boolean isBadVersion(int num) {
        int pick = getBadVersion();

        return (pick == num);
    }

}

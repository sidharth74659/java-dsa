import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {

    public static void main(String[] args) {
        // int[] candies = { 2, 3, 5, 1, 3 };   //{true,true,true,false,true}
        // int extraCandies = 3;

        // int[] candies = { 4,2,1,1,2};    //{true,false,false,false,false}
        // int extraCandies = 1;

        int[] candies = { 12,1,12}; //{true,false,true}
        int extraCandies = 10;
        List<Boolean> op = kidsWithCandies(candies, extraCandies);
        System.out.println("output : " + op);
        
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();

        int maxCandies = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
                arr.add(candies[i] + extraCandies >= maxCandies);
        }

        return arr;
    }

    // public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    // {
    // int len = candies.length;
    // // boolean[] result = new boolean[len];
    // List<Boolean> result = new ArrayList<Boolean>(Arrays.asList(new
    // Boolean[len]));
    // int max = candies[0];

    // for (int i = 0; i < len; i++)
    // if (max < candies[i])
    // max = candies[i];

    // for (int i = 0; i < len; i++) {
    // boolean temp = (candies[i] + extraCandies) >= max ? true : false;
    // result.set(i, temp);
    // }
    // // List<Boolean> result1 = Booleans.asList(result);

    // return result;
    // }
}

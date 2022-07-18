import java.util.ArrayList;
import java.util.List;

public class noOfCandies {
  public static void main(String[] args) {
    // @From Solution
    kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3); // {true,true,true,false,true}
    kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1); // {true,false,false,false,false}
    kidsWithCandies(new int[] { 12, 1, 12 }, 10); // {true,false,true}
    
    // @From Online
    KidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3); // {true,true,true,false,true}
    KidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1); // {true,false,false,false,false}
    KidsWithCandies(new int[] { 12, 1, 12 }, 10); // {true,false,true}
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> list = new ArrayList<Boolean>();

    int max = 0;
    for (int candy : candies) {
      max = Math.max(candy, max);
    }

    for (int candy : candies) {

      candy += extraCandies;

      list.add(candy >= max);
    }

    System.out.println("list : " + list);
    return list;
  }

  public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> list = new ArrayList<Boolean>();

    int max = 0;
    for (int candy : candies) {
      max = Math.max(candy, max);
    }

    for (int candy : candies) {
      list.add(candy + extraCandies >= max);
    }

    System.out.println("list : " + list);
    return list;
  }
}

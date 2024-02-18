import java.util.*;

public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args){
       List<Boolean> res = kidsWithCandies(new int[]{2,8,7},   1);
       System.out.println(res);
    }
    public static List<Boolean>  kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int greatest = 0;
        for(int i = 0; i < candies.length; i++){
            greatest = Math.max(candies[i],greatest);
        }
        for (int i=0; i < candies.length; i++){
            int sum = extraCandies + candies[i];
            if(sum >= greatest)  result.add(true);
            else result.add(false);

        }
        return result;
    }
}

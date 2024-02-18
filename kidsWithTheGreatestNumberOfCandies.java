import java.util.*;

public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args){
       List<Boolean> res = kidsWithCandies(new int[]{2,8,7},   1);
       System.out.println(res);
    }
    public static List<Boolean>  kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        Map<Integer, Integer> candiesMap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            candiesMap.put(i, candies[i]);
            arr.add(candies[i]);

        }
        int keyCheck;
        int valueCheck = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : candiesMap.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if((value+extraCandies)>valueCheck){
                valueCheck =Collections.max(arr);
                result.add(true);
            }
            else {
                valueCheck = Collections.max(arr);
                result.add(false);
            }
        }
        return result;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args){
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int num : nums1){
            if(map.containsKey(num)){
                map.put(num,map.get(num) +1);
            }
            else {
                map.put(num,1);
            }
        }
        for(int num : nums2){
            if(map2.containsKey(num)){
                map2.put(num,map2.get(num) +1);
            }
            else {
                map2.put(num,1);
            }
        }
        for(int num : nums1){
            if(map.containsKey(num)==map2.containsKey(num)){
                map.remove(num);
                map2.remove(num);

            }
        }
        for(int num : nums2){
            if(map.containsKey(num)==map2.containsKey(num)){
                map.remove(num);
            }
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<Integer> keyList2 = new ArrayList<>(map2.keySet());

        result.add(keyList);
        result.add(keyList2);
        return result;
    }
}

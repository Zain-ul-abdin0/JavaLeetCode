import java.util.*;

public class UniqueOccurrences {
    public static void main(String[] args){
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for(int num : arr){
                if(map.containsKey(num)){
                    map.put(num,map.get(num) +1);
                }
                else {
                    map.put(num,1);
                }
            }
        Set<Integer> set = new HashSet<Integer>(map.values());
        if(set.size()==map.size()){
            return true;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        return false;
    }
}

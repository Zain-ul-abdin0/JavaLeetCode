import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateInArray {
    public static void main(String[] args){
        Integer[] array ={1,2,2,3,34,4,4,5,6,7,8};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        Set<Integer> duplicate = new HashSet<>();
        List<Integer> duplicateList = arrayList.stream().filter(item -> !duplicate.add(item)).toList();

        System.out.println(duplicateList);
    }
}

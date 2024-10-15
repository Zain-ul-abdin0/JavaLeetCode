import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args){

        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1,new Person("Bob", 30));
        map.put(2,new Person("Bob", 30));
        map.put(3,new Person("Bob", 30));

        for(Map.Entry<Integer, Person> mapIterator  : map.entrySet()){
            System.out.println(mapIterator.getValue());
        }
        System.out.println(fun(Arrays.asList("1,2,3")));

    }
    public static <T> T fun(T input){
        return input;
    }
}

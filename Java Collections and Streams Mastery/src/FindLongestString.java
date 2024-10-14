import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args){
        List<String> fruit =  Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longest = fruit.stream().max(Comparator.comparingInt((String s) -> s.length()));
        System.out.println(longest);
    }
}

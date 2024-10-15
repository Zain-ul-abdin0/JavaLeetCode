import java.util.Arrays;
import java.util.List;

public class MapCollection {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(2,2,2,2,2);
        System.out.println(list.stream().map(s->s*2).distinct().toList());
    }
}

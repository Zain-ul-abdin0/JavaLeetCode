import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPreparationJava {
    public static void main(String[] args){
        LinkedList<Integer> links = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
         List<Integer> results;
         results = links.stream().filter(f-> f==3).collect(Collectors.toList());
        System.out.println(results);
       System.out.println(function());
    }
    public static String function(){
        return "Hello, world!";
    }

}

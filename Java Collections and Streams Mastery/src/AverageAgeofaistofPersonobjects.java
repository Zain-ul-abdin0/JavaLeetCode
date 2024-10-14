import java.util.Arrays;
import java.util.List;

public class AverageAgeofaistofPersonobjects {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(    new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));

        double average = persons.stream().mapToInt((Person p)-> p.getAge()).average().orElse(0);
     System.out.println(average);
    }

}

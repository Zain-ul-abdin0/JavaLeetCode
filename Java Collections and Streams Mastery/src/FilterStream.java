import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(    new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 35));

    List<Person> result = persons.stream().filter((Person p) -> p.getAge() > 30 ).toList();
     System.out.println(result);
}

}

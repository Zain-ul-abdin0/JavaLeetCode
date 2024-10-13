import java.util.*;
import java.util.stream.Collectors;

public class InterviewPreparationJava {
    public static void main(String[] args){
        Student student1 = new Student(25,"Zain");
        Student student2 = new Student(20,"Alex");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        Collections.sort(students);

        for(Student student : students){
            System.out.println(student);
        }
    }


}

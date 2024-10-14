import java.util.Comparator;

public class Student    {
    public Integer age;
    public  String name;
    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.getAge().compareTo(o.getAge());
//    }


}

import java.util.Comparator;

public class Student implements Comparator {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name=:" + name + '\'' +
                "\n age:" + age +
                '\n';
    }

    public static Comparator<Student> sortName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Student> sortAge = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
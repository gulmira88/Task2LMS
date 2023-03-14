import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aykejan",45);
        Student student2 = new Student("Ayzat",20);
        Student student3 = new Student("Oksana",25);
        Student student4 = new Student("Oksana",25);
        Student student5 = new Student("Kanykey",18);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        LinkedList<Student>LMS = new LinkedList<>();
        LMS.addAll(students);
        LMS.sort(Student.sortName);

        System.out.println(LMS);
        LMS.sort(Student.sortAge);
        System.out.println(LMS);



    }
}
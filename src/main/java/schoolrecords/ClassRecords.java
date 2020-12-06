package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student){
        for (Student student1 : students){
            if (student.getName().equals(student1.getName())) {
                System.out.println("Student already in the class!");
                return false;
            }
        }
        this.students.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        for (Student student1 : students) {
            if (student.getName().equals(student1.getName())) {
                this.students.remove(student);
                return true;
            }
        }
        System.out.println("Student is not in the class!");
        return false;
    }



}

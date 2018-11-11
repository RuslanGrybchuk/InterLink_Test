package students;

import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;

public class Import_Students {

    public ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList();

        Student s1 = new Student("Andrew Kostenko", 83);
        Student s2 = new Student("Julia Veselkina", 63);
        Student s3 = new Student("Maria Perechrest", 45);
        Student s4 = new Student("Dmytro Lutsiuk", 94);
        Student s5 = new Student("Ivan Petriv ", 11);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        return students;
    }
}
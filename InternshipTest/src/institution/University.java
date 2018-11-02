package institution;
import person.Student;


import java.util.ArrayList;

public class University {

    public static ArrayList<Student> studentList = new ArrayList();     //stores student`s names and knowledge

    public String name;
    private String student;

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {               // wasn`t sure what this method had to do
        this.student = student.getName();                   // so i made it get student`s name and store it
    }

    public void addStudent(Student student) {               // adds Student objects to the list
        studentList.add(student);
    }
}



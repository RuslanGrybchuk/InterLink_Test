package institution.interlink;
import person.Student;

import java.util.ArrayList;

public class Internship {
    University university;

    private String name;

    ArrayList<Student> internList = new ArrayList();                        // a list of intern students

    public Internship(String name) {
       this.name = name;
       setStudent();
    }

    public void setStudent() {                 // calculates what students suit for internship and stores `em in the internList

        Student intern = new Student();                                    // an object for temporal storage

        int sum = 0;
        int i;
        for(i = 0; i < university.studentList.size(); i++) {               // get the sum of student`s knowledge
            intern = university.studentList.get(i);
            sum += intern.getKnowledge();
        }

        double averageKnowledge = sum / i;                                 // calculates average

        for(int n = 0; n < university.studentList.size(); n++) {
            intern = university.studentList.get(n);
            if(intern.getKnowledge() > averageKnowledge) {          // stores students that meet the requirements in the internList
                internList.add(intern);
            }
        }
    }

    public void getStudents() {                                     // prints out internList (students with knowledge above average)

        Student intern = new Student();                             // an object for temporal storage

        for(int i = 0; i < internList.size(); i++){
            intern = internList.get(i);
            System.out.println(intern.getName());
        }
    }

}


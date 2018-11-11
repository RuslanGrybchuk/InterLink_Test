package main;

import students.Import_Students;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;



public class Application {

    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        //university.addStudent(new Student("Andrew Kostenko", 35));
	    //university.addStudent(new Student("Julia Veselkina", 73));
        //university.addStudent(new Student("Maria Perechrest", 93));

        getStudents(university); // add students from a file or a DB

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        internship.getStudents();   // prints out names of internship students
    }


    public static void getStudents(University university){
        Import_Students imports = new Import_Students();

        for(Student student : imports.getStudents()) {
            university.addStudent(student);
        }
    }

}


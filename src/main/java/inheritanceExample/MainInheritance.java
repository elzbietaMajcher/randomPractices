package inheritanceExample;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainInheritance {
    public static void main (String[] args){
        Student student = new Student ("Willy", "April 20, 2000", "4.0");

        Person person1 = new Person("Joey", "April 10, 1990");

        Teacher teacher = new Teacher("Sara","March 1, 1980", "College", 4000, 10);

        Date assignmentDate = Date.valueOf(LocalDate.now().plusDays(2));
        Assignment assignment = new Assignment("Calculus Homework", "Calculus", assignmentDate);

//        student.printInfo();
//        System.out.println();
//        person1.printInfo();

        teacher.printInfo();

        student.setCurrentAssignment(assignment);
        student.setCurrentAssignment("Biology");
        student.printAssignmentInfo();



    }
}

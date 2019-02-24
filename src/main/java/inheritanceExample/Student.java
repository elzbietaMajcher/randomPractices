package inheritanceExample;

import java.util.Date;

public class Student extends Person {

    private String gpa;
    private Assignment currentAssignment;

    public Student (String studentName, String studentBirthDate, String gpa){
        super(studentName, studentBirthDate);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + getName() +
                " gpa='" + gpa + '\'' +
                ", currentAssignment=" + currentAssignment +
                '}';
    }

    @Override
    public void printInfo (){
        System.out.println("My name is " + getName() + " I was born in " + getBirthDate());
        System.out.println("I am a student, my score is " + gpa);
    }

    public void setCurrentAssignment(Assignment currentAssignment) {
        this.currentAssignment = currentAssignment;
    }

    public void setCurrentAssignment(String assignment){
        currentAssignment = new Assignment(assignment, "Default Class", new Date());
    }

    public void printAssignmentInfo(){
        if (currentAssignment !=null){
            System.out.println(currentAssignment.getName() +", " + currentAssignment.getClassName() + ", " + currentAssignment.getAssignmentDate());
        }
    }
}

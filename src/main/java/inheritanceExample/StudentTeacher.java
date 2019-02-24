package inheritanceExample;

public class StudentTeacher extends Teacher {

    private String studentTeacherSchool;


    public StudentTeacher(String name, String birthDate, String schoolName, double salary, int numYearsAtSchool, String studentTeacherSchool) {
        super(name, birthDate, schoolName, salary, numYearsAtSchool);
        this.studentTeacherSchool = studentTeacherSchool;
    }
}

package inheritanceExample;

public class Teacher extends Person {
    private String schoolName;
    private double baseSalary;
    private int numYearsAtSchool;

    public Teacher(String name, String birthDate, String schoolName, double salary, int numYearsAtSchool) {
        super(name, birthDate);
        this.schoolName = schoolName;
        this.baseSalary = salary;
        this.numYearsAtSchool = numYearsAtSchool;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I am a teacher in " + schoolName);
    }

    public final double getSalary(){
        return numYearsAtSchool * 10 + baseSalary;
    }
}

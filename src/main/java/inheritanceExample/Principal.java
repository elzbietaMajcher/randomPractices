package inheritanceExample;

import java.util.Date;

public class Principal extends Person {

    private Date joinDate; // the date the principal joined to school

    public Principal(String name, String birthDate, Date joinDate) {
        super(name, birthDate);
        this.joinDate = joinDate;
    }
}

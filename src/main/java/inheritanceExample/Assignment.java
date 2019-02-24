package inheritanceExample;

import java.util.Date;

public class Assignment {

    private String name;
    private String className;
    private Date assignmentDate;

    public Assignment (String name, String className, Date assignmentDate){
        this.name = name;
        this.className = className;
        this.assignmentDate = assignmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Date assignmentDate) {
        this.assignmentDate = assignmentDate;
    }
}


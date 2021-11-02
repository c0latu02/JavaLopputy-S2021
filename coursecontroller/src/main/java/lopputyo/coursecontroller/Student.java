package lopputyo.coursecontroller;

public class Student {
    private long studentId;
    private String firstName;
    private String lastName;

    private static long idStudentCounter = 0;


    public Student() {
        this(0, "", "");
    }

    public Student(long StudentId, String firstName, String lastName) {
        this.studentId = idStudentCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

 

    public long getStudentId() {
        return this.studentId;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName" + this.firstName + " lastName";
    }

    


}

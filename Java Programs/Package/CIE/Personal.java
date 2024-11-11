package CIE;

public class Personal {
    protected String usn;
    protected String name;
    protected int sem;

    public Personal(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public void displayPersonalDetails() {
        System.out.println("USN: " + usn + ", Name: " + name + ", Semester: " + sem);
    }
}

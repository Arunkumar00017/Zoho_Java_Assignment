public class oopsAss1ques5b {
    private String name;
    private String rollNumber;
    private oopsAss1ques5a department;

    public oopsAss1ques5b(String name, String rollNumber, oopsAss1ques5a department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public oopsAss1ques5a getDepartment() {
        return department;
    }
}
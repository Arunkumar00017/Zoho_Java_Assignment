public class oopsAss1ques2 {
    private String name;
    private String employeeId;
    private String email;
    private double salary;
    private static int employeeCount = 0;

    public oopsAss1ques2(String name, String employeeId, String email, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.salary = salary;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
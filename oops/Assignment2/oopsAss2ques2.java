import java.util.ArrayList;

public class oopsAss2ques2 {
    private String name;
    private String employeeId;
    private String email;
    private double salary;

    public oopsAss2ques2(String name, String employeeId, String email, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Email: " + email + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        ArrayList<oopsAss2ques2> employees = new ArrayList<>();
        employees.add(new oopsAss2ques2("John", "EMP001", "john@example.com", 50000));
        employees.add(new oopsAss2ques2("Jane", "EMP002", "jane@example.com", 60000));
        employees.add(new oopsAss2ques2("Mike", "EMP003", "mike@example.com", 55000));

        for (oopsAss2ques2 emp : employees) {
            emp.display();
        }
    }
}
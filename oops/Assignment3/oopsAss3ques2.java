class Student {
    protected String name;
    protected int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ZSGSStudent extends Student {
    private String course;

    public ZSGSStudent(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class oopsAss3ques2 {
    public static void main(String[] args) {
        ZSGSStudent student = new ZSGSStudent("Arun", 21, "Java");
        student.display();
    }
}
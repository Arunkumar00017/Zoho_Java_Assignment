package oopsAssignment4;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name +
                (age > 0 ? ", Age: " + age : "") +
                (address != null ? ", Address: " + address : ""));
    }
}

public class oopsAss4ques2 {
    public static void main(String[] args) {
        Person p1 = new Person("Arun");
        Person p2 = new Person("Kumar", 23);
        Person p3 = new Person("Ravi", 30, "Chennai");

        p1.display();
        p2.display();
        p3.display();
    }
}

package oopsAssignment4;

public class oopsAss4ques1 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static void main(String[] args) {
        oopsAss4ques1 calc = new oopsAss4ques1();
        System.out.println("Add (int): " + calc.add(10, 5));
        System.out.println("Add (double): " + calc.add(10.5, 5.5));
        System.out.println("Subtract (int): " + calc.subtract(10, 5));
        System.out.println("Multiply (double): " + calc.multiply(3.5, 2.0));
        System.out.println("Divide (int): " + calc.divide(10, 2));
    }
}

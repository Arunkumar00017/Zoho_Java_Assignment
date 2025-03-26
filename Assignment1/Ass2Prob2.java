package Assignment2;

public class Ass2Prob2 {
    public static void main(String[] args) {
        float floatValue = 10.5f;
        int intValue = (int) floatValue;
        double doubleValue = 20.99;
        float floatFromDouble = (float) doubleValue;
        int intNumber = 100;
        short shortNumber = (short) intNumber;
        System.out.println("Float to Int: " + intValue);
        System.out.println("Double to Float: " + floatFromDouble);
        System.out.println("Int to Short: " + shortNumber);
    }
}

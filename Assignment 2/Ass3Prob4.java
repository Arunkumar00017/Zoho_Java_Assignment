public class Ass3Prob4 {
        public static void main(String[] args) {
            int outsideIf = 10;
            if (outsideIf > 5) {
                int insideIf = 20;
                System.out.println("Inside if block: outsideIf = " + outsideIf);
                System.out.println("Inside if block: insideIf = " + insideIf);
            }
            System.out.println("Outside if block: outsideIf = " + outsideIf);
        }
    }

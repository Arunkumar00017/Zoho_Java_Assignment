public class Ass4Prob5 {
        public static void main(String[] args) {
            System.out.println("Prime numbers between 1 and 30:");

            for (int num = 2; num <= 30; num++) {
                boolean isPrime = true;

                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }

import java.util.Scanner;public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.println("");
        System.out.println("Sum: " + sum(n));
        System.out.println("Factorial: " + f(n));
        System.out.println("Odd Factorial: " + oddf(n));
        System.out.println("Number of digits: " + digits(n));
        System.out.println("Is prime: " + isPrime(n));
        System.out.println("All even or all odd digits: " + evenOrOddDigts(n));

        System.out.println("--------------------------------");
        System.out.print("Enter n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter n2: ");
        int n2 = scanner.nextInt();
        System.out.println("");
        System.out.println("Division: " + division(n1, n2));
        System.out.println("Remainder: " + remainder(n1, n2));
        System.out.println("Is divisible: " + isDivisible(n1, n2));
    }

    //1
    public static int sum(int n) {
        if (n<=0) {
            return 0;
        }
        return n + sum(n-1);
    }

    //2
    public static int f(int n) {
        if (n<=0) {
            return 1;
        }
        return n * f(n-1);
    }
     
    //3
    public static int oddf(int n) {
        if (n <= 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return oddf(n-1);
        }
        return n * oddf(n-1);
    }

    //4
    public static int digits(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + digits(n/10);
    }

    //5
    public static int division(int n1, int n2) {
        if (n1 < n2) {
            return 0;
        }
        return 1 + division(n1 - n2, n2);
    }

    //6
    public static int remainder(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        }
        return remainder(n1 - n2, n2);
    }

    //7
    public static boolean isDivisible(int n1, int n2) {
        if (n1 == 0) {
            return true;
        }
        if (n1 < n2) {
            return false;
        }
        return isDivisible(n1 - n2, n2);
    }

    //8
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int temp = 2;
        while (temp < n) {
            if (n % temp == 0) {
                return false;
            }
            temp++;
        }
        return true;
    }

    //9
    public static boolean evenOrOddDigts(int n) {
        if (n < 10) {
            return true;
        }
        
        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;
        
        if (lastDigit % 2 != secondLastDigit % 2) {
            return false;
        }
        
        return evenOrOddDigts(n / 10);
    }

}
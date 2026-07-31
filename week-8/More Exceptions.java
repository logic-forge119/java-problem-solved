import java.util.Scanner;

class Calculator {

    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        return (int) Math.pow(n, p);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
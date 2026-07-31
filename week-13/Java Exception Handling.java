import java.util.Scanner;

class MyCalculator {

    long power(int n, int p) throws Exception {

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        long result = 1;

        for (int i = 0; i < p; i++) {
            result *= n;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator mc = new MyCalculator();

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(mc.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int student = 0;
        int rockstar = 0;
        int hacker = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("Student"))
                student++;
            else if (s.equals("Rockstar"))
                rockstar++;
            else if (s.equals("Hacker"))
                hacker++;
        }

        System.out.println(student + " " + rockstar + " " + hacker);
    }
}
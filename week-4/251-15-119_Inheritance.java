import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        int avg = sum / testScores.length;

        if (avg >= 90)
            return 'O';
        else if (avg >= 80)
            return 'E';
        else if (avg >= 70)
            return 'A';
        else if (avg >= 55)
            return 'P';
        else if (avg >= 40)
            return 'D';
        else
            return 'T';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        Student s = new Student(firstName, lastName, id, scores);

        s.printPerson();
        System.out.println("Grade: " + s.calculate());

        sc.close();
    }
}
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
    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        int sum = 0;

        for (int score : testScores) {
            sum += score;
        }

        int average = sum / testScores.length;

        if (average >= 90 && average <= 100)
            return 'O';
        else if (average >= 80)
            return 'E';
        else if (average >= 70)
            return 'A';
        else if (average >= 55)
            return 'P';
        else if (average >= 40)
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

        Student student = new Student(firstName, lastName, id, scores);

        student.printPerson();
        System.out.println("Grade: " + student.calculate());

        sc.close();
    }
}
import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }

                int nameCompare = s1.getFirstName().compareTo(s2.getFirstName());

                if (nameCompare != 0) {
                    return nameCompare;
                }

                return s1.getId() - s2.getId();
            }
        });

        for (Student s : students) {
            System.out.println(s.getFirstName());
        }

        sc.close();
    }
}
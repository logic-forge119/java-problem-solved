import java.util.*;

class Singleton {
    public String str;

    private static Singleton obj = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Singleton s = Singleton.getSingleInstance();
        s.str = sc.nextLine();

        System.out.println("Hello I am a singleton! Let me say " + s.str + " to you");
    }
}
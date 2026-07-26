class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Main {
    public static void main(String[] args) {
        Adder obj = new Adder();

        System.out.println("My superclass is: " + obj.getClass().getSuperclass().getName());
        System.out.println(obj.add(10, 32));
        System.out.println(obj.add(10, 3));
        System.out.println(obj.add(10, 10));
    }
}
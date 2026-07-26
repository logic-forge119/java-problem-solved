class Vehicle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Cycle extends Vehicle {
    String define_me() {
        return "a cycle with an engine.";
    }

    String getMySuperClass() {
        return super.define_me();
    }
}

class Motorcycle extends Cycle {
    void print() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        System.out.println("My ancestor is a cycle who is " + getMySuperClass());
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.print();
    }
}
class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Sports s1 = new Sports();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();

        Sports s2 = new Soccer();
        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();
    }
}
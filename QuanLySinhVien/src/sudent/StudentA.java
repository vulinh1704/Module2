package sudent;

public class StudentA extends Student {
    private static final String MATH = "Math";
    private static final String PHYSICS = "Physics";
    private static final String CHEMISTRY = "Chemistry";

    public StudentA() {
    }

    public StudentA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Student A exam  " + MATH +
                " and " + PHYSICS +
                " and " + CHEMISTRY + " }";
    }
}

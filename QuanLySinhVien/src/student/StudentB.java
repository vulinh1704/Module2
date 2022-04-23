package student;

public class StudentB extends Student {
    private static final String MATH = "Math";
    private static final String CHEMISTRY = "Chemistry";
    private static final String BIOLOGICAL = "Biological";

    public StudentB() {
    }

    public StudentB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Student B exam  " + MATH +
                " and " + CHEMISTRY +
                " and " + BIOLOGICAL + " }";
    }
}

package student;

public class StudentC extends Student {
    private static final String LITERATURE = "Literature";
    private static final String HISTORY = "History";
    private static final String GEOGRAPHY = "Geography";

    public StudentC() {
    }

    public StudentC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }
    @Override
    public String toString() {
        return "Student B exam  " + LITERATURE +
                " and " + HISTORY +
                " and " + GEOGRAPHY + " }";
    }
}

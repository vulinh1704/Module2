package learninterfacecomparable;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String address;
    private int age;
    private float fee;

    public Student() {
    }

    public Student(String id, String name, String address, int age, float fee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.fee = fee;
    }

    public Student(String id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

}

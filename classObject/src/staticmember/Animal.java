package staticmember;

import java.util.Objects;

public class Animal {
    protected String name;
    private int age;
    private float weight;

    public void eat() {

    }

    public void move() {
        System.out.println("animal is moving");

    }

    public void sleep() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    protected String speak() {
        return "lalala";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(this.getClass() == obj.getClass())) {
            return false;
        }

        Animal other = (Animal) obj;
        return Objects.equals(this.name ,other.name) && this.age == other.getAge();
    }
}

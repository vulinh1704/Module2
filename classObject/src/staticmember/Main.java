package staticmember;

public class Main {
    public void main(String[] args) {
        Animal tom = new Animal();
        tom.setName("tom");
        tom.setAge(3);

        Animal jerry = new Animal();
        jerry.setName("tom");
        jerry.setAge(3);
        System.out.println(jerry.equals(jerry));
    }
}



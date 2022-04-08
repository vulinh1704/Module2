package staticmember;

public class Main {
    public static void main(String[] args) {
        Animal s = new Fish();
        Object obj = new Fish();
        Animal tom = new Cat();

        if(tom instanceof Fish) {
            Fish fish = (Fish) tom;
        }
        Fish f = (Fish) s;
    }
}



package staticmember;

import learnabtract.A;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());

        Animal a = animals.get(0);
        animals.set(1, new Animal());

        Animal[] arr = new Animal[4];
//        animals.toArray(arr);
        System.out.println("size of arraylist : " + animals.size());
        System.out.println("size of array : " + arr.length);


    }
}

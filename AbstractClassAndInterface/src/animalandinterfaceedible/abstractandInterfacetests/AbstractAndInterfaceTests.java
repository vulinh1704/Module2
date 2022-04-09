package animalandinterfaceedible.abstractandInterfacetests;

import animalandinterfaceedible.animal.Animal;
import animalandinterfaceedible.animal.Chicken;
import animalandinterfaceedible.animal.Tiger;
import animalandinterfaceedible.fruit.Apple;
import animalandinterfaceedible.fruit.Fruit;
import animalandinterfaceedible.fruit.Orange;
import animalandinterfaceedible.interfaceedible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = new Chicken();
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

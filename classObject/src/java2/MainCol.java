package java2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainCol {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("haha");
        list.add("huhu");
        list.add("hehe");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
        list.add(0 , "hic");
        list.add(2,"huj");
        list.forEach((item) ->{
            System.out.print(item + " ");
        });
    }
}

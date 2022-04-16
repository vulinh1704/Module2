package productmanager;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();

    public void add(Product product) {
        list.add(product);
    }

    public void repair(int id, Product product) {
        if (search(id) == -1) {
            System.out.println("No Find!");
        } else {
            list.set(search(id), product);
        }
    }

    public void del(int id) {
        if (search(id) == -1) {
            System.out.println("No Find!");
        } else {
            list.remove(search(id));
        }
    }

    public int search(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int search(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void sortP() {
        Collections.sort(list);
    }

    public void print() {
        for (Product e : list) {
            System.out.println(e);
        }
        System.out.println("-------------------");
    }
}

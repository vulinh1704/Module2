package quanlysanpham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements Serializable {
    private final List<Product> products = new ArrayList<>();
    public ProductManagement() {
    }
    public void addProduct(Product product){
       products.add(product);
    }
    public void edit(int id ,Product product){
        if(searchId(id) == -1){
            System.out.println("Không tìm thấy sản phầm này!");
        } else {
            products.set(searchId(id), product);
        }
    }
    public void erase(int id){
        if(searchId(id) == -1){
            System.out.println("Không tìm thấy sản phầm này!");
        } else {
            products.remove(searchId(id));
        }
    }
    public int searchId(int id){
        for (int i = 0; i < products.size(); i++) {
            if(id == products.get(i).getId()){
                return id;
            }
        }
        return -1;
    }
    public void display(){
        for (Product product: products) {
            System.out.println(product);
        }
        System.out.println("-----------------");
    }
}

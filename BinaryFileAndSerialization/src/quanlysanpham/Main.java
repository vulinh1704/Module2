package quanlysanpham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, ProductManagement productManagement) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productManagement);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ProductManagement readDataFromFile(String path) {
        ProductManagement productManagement = new ProductManagement();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fis);
            productManagement = (ProductManagement) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productManagement;
    }

    public static void writeListToFile(String path, List<ProductManagement> productManagementList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productManagementList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<ProductManagement> readListDataFromFile(String path) {
        List<ProductManagement> productManagements = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fis);
            productManagements = (List<ProductManagement>) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productManagements;
    }


    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.addProduct(new Product(1, "Iphone12", "Iphone", 1200000));
        productManagement.addProduct(new Product(2, "Redmi Node 7", "Redmi", 50000));
        productManagement.addProduct(new Product(3, "Galaxy", "SamSung", 30000));
        productManagement.addProduct(new Product(4, "1280", "Nokia", 1563222));
//        writeToFile("product.txt", productManagement);
//        productManagement.edit(1, new Product(5, "Macbook", "Iphone", 1563222));
//        writeToFile("product.txt", productManagement);
//        readDataFromFile("product.txt").display();



       //
        List<ProductManagement> productManagementList = new ArrayList<>();
        productManagementList.add(productManagement);
        productManagementList.add(productManagement);
        writeListToFile("product.txt", productManagementList);

        List<ProductManagement> productReadListDataFromFile = readListDataFromFile("product.txt");
        for (ProductManagement pm : productReadListDataFromFile) {
            pm.display();
        }
    }
}

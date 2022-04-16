package productmanager;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("Redmi" , 170401, 1000);
        Product product2 = new Product("Iphone" , 160201, 1500);
        Product product3 = new Product("SamSung" , 200701, 900);
        Product product4 = new Product("Opp" , 170402, 1000);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product2);
        productManager.sortP();
        productManager.print();
        System.out.println(productManager.search("Iphone"));
        System.out.println("------------------------");
        Product product5 = new Product("TheK2" , 170501, 1000);
        productManager.repair(200701 , product5);
        productManager.print();
        productManager.del(160201);
        productManager.print();
    }
}

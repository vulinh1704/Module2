package learnabtract;

public class D implements XXX{

    @Override
    public void inTien() {
        System.out.println("hello");
    }
}
class E implements XXX{

    @Override
    public void inTien() {
        System.out.println("hi");
    }
}
interface XXX {
    void inTien();
}

class Testxx {
    public static void main(String[] args) {
        XXX x = new E();
        x.inTien();
    }
}
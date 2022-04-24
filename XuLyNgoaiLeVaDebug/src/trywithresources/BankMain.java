package trywithresources;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Truong Vu Linh", "123445554", 100000);
        try {
            bankAccount.withDraw(100000000);
        } catch (HetTienException e) {
            System.out.println("Ban da het tien vui long nap them " + e.getAmount());
        }

    }
}

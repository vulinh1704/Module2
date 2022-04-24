package trywithresources;

public class BankAccount {
    private String name;
    private String accountNumber;
    private float balance;

    public BankAccount(String name, String accountNumber, float balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withDraw(float amount) throws HetTienException{
        if(amount < this.balance){
            amount -= this.balance;
        } else {
            throw new HetTienException(amount - this.balance);
        }
    }

    public float getBalance() {
        return balance;
    }
}

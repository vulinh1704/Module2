package trywithresources;

public class HetTienException extends Exception{
    private float amount;

    public HetTienException(float amount) {
        this.amount = amount;
    }
    public float getAmount(){
       return this.amount;
    }
}

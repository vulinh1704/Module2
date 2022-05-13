package validatesodienthoai;

public class PhoneTest {
    private static Phone phone;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)" , "84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)" , "(84)(0978489648)"};

    public static void main(String[] args) {
        phone = new Phone();
        for (String item: validPhone) {
            boolean isvalid = phone.validate(item);
            System.out.println("Class name is " + item +" is valid: "+ isvalid);
        }
        for (String item: invalidPhone) {
            boolean isvalid = phone.validate(item);
            System.out.println("Class name is " + item +" is valid: "+ isvalid);
        }
    }
}

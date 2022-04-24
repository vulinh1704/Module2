package trywithresources;

public class Resources implements  AutoCloseable{
    @Override
    public void close() {
        System.out.println("Đóng tài nguyên");
        System.out.println("Giải phóng bộ nhớ");
    }
    public String getMessage(boolean isError) throws RuntimeException{
        System.out.println(1/0);
        if(isError){
            throw new RuntimeException();
        }
        return "Hello";
    }
}

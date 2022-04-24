package trywithresources;

public class test {
    public static void main(String[] args) {
        Resources resources = new Resources();
        try {
           String message =  resources.getMessage(false);
            System.out.println(message);
        } catch (Exception e){
            System.out.println("Đã có lỗi xảy ra");
        } finally {
            resources.close();
        }

        System.out.println("------------------");

        try (Resources x = new Resources();){
            String message =  resources.getMessage(true);
            System.out.println(message.toString());
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Đã có lỗi xảy ra");
        }
    }
}

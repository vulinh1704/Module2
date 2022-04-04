import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số:");
        int number = scanner.nextInt();
        String string = "";
        if (0 <=  number && number < 10) {
            string = DocSo.chuyenSoThanhChu(number);
        } else if (number < 20){
            string = "Mười " + DocSo.chuyenSoThanhChu(number%10);
        } else if (number < 100){
            string = DocSo.chuyenSoThanhChu(number/10)+" mươi "+ DocSo.chuyenSoThanhChu(number%10);
        }
        System.out.println("" + string);
    }

    public static String chuyenSoThanhChu(int number) {
        String string = "";
        switch (number) {
            case 0:
                string = "không";
                break;
            case 1:
                string = "một";
                break;
            case 2:
                string = "hai";
                break;
            case 3:
                string = "ba";
                break;
            case 4:
                string = "bốn";
                break;
            case 5:
                string = "năm";
                break;
            case 6:
                string = "sáu";
                break;
            case 7:
                string = "bảy";
                break;
            case 8:
                string = "tám";
                break;
            case 9:
                string = "chín";
                break;
        }
        return string;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        Scanner s = new Scanner(System.in);
//        int i = 1;
//        do {
//            System.out.println("Nhập tên sinh viên " + i + " : ");
//            String hoTen = s.nextLine();
//            if (hoTen == null || hoTen.equals("")) {
//                break;
//            }
//            list.add(hoTen);
//            i++;
//        } while (true);
//        for (String item : list) {
//            item = item.trim();
//            if (item.startsWith("Nguyen ") || item.endsWith(" Tuan")) {
//                String ho = item.substring(0, item.indexOf(" "));
//                String ten = item.substring(item.lastIndexOf(" "));
//                String tenDem = item.substring(item.indexOf(" ") , item.lastIndexOf(" "));
//                System.out.println("Ho va Ten : " + ho.toUpperCase(Locale.ROOT) + tenDem.toUpperCase(Locale.ROOT)
//                + ten.toUpperCase(Locale.ROOT));
//            }
//        }


//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Nhap thong tin : ");
//        String content = scanner1.nextLine();
//
//        System.out.println("Nhap noi dung can tim : ");
//        String find = scanner1.nextLine();
//
//        System.out.println("Nhap noi dung can thay the : ");
//        String replace = scanner1.nextLine();
//
//        String result = content.replace(find , replace);
//        System.out.println("\rNoi dung sau khi thay the : " + result);

        Scanner in = new Scanner(System.in);
        System.out.println("Email : ");
        String email = in.nextLine();

        System.out.println("So Dien Thoai Hue : ");
        String phone = in.nextLine();

        String reEmail = "\\w+@\\w+\\.\\w+";
        if(email.matches(reEmail)){
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }

        String rePhone = "0549-\\d{6}";
        if(phone.matches(rePhone)){
            System.out.println("So dien thoai o Hue");
        } else {
            System.out.println("So dien thoai khong hop le or khong o Hue");
        }
    }
}

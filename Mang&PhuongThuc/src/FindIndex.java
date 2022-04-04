import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        String[] students = {"Nam", "Jack", "Son", "Tung", "Hien", "Ho"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student : ");
        String name = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println(name + " is located in position " + i);
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Not Found !");
        }
    }
}

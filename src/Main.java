import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ID: ");
        String id=sc.nextLine();
        System.out.println("PASSWORD: ");
        String pw=sc.nextLine();
        System.out.println("이름: ");
        String name=sc.nextLine();
        System.out.println("주민번호: ");
        String id_number=sc.nextLine();
        System.out.println("전화번호: ");
        String phone_number=sc.nextLine();
        System.out.println("주소: ");
        String address=sc.nextLine();
        System.out.println("직업: ");
        String job=sc.nextLine();


        System.out.println("ID: " + id);
        System.out.println("비번: " + pw);
        System.out.println("비번 확인: " + pw);
        System.out.println("이름: " + name);
        System.out.println("주민번호: " + id_number);
        System.out.println("전화번호: " + phone_number);
        System.out.println("주소: " + address);
        System.out.println("직업: " + job);


    }
}

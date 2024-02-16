
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 2가지를 입력해 주세요.");

        System.out.print("첫 번째 숫자 : ");
        String num1 = sc.next();

        System.out.print("두 번째 숫자 : ");
        String num2 = sc.next();

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("+, -을 입력하세요.");


        int intnum1 = Integer.parseInt(num1);
        int intnum2 = Integer.parseInt(num2);

        String opcode = sc.next();

        if (opcode.equals("+")) {
            result = intnum1 + intnum2;
        } else if (opcode.equals("-")) {
            result = intnum1 - intnum2;
        } else if (opcode.equals("*")) {
            result = intnum1 * intnum2;
        } else if (opcode.equals("/")) {
            result = intnum1 / intnum2;
        } else {
            System.out.println("잘못된 연산 기호입니다.");
        }

        System.out.println("연산결과 : " + result);
    }


}

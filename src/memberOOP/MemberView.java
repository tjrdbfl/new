package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);

        Member member=new Member();

        System.out.println("id를 입력해주세요");
        member.setId(sc.next());

        System.out.println("비밀번호를 입력해주세요");
        member.setPw(sc.next());

        System.out.println("비밀번호를 한번 더 입력해주세요");
        member.setPwAgain(sc.next());

        System.out.println("이름를 입력해주세요");
        member.setName(sc.next());

        System.out.println("주민번호를 입력해주세요");
        member.setPersonId(sc.next());

        System.out.println("전화번호를 입력해주세요");
        member.setPhoneNumber(sc.next());

        System.out.println("주소를 입력해주세요");
        member.setAddress(sc.next());

        System.out.println("직업을 입력해주세요");
        member.setJob(sc.next());

        System.out.println("ID : " + member.getId());
        System.out.println("비 번 : " + member.getPw());
        System.out.println("비번확인 : " + member.getPwAgain());
        System.out.println("이 름 : " + member.getName());
        System.out.println("주민번호 : " + member.getPersonId());
        System.out.println("전화번호 : " + member.getPhoneNumber());
        System.out.println("주 소 : " + member.getAddress());
        System.out.println("직업 : " + member.getJob());

    }
}
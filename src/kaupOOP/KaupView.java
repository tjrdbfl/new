package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {  //메소드 3개
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Member person=new Member();

        double randomTall = person.getRandomTall();
        double randomWeight = person.getRandomWeight();

        new Member(randomTall,randomWeight);

        person.setHeight(randomTall);
        person.setWeight(randomWeight);

        KaupService service=new KaupServiceImpl();

        double bmi=service.createBMI();
        String bodyMass=service.createBodyMass();

        System.out.println("================= BMI 계산기 =================");
        System.out.println("이름: "+person.getName());
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("BMI는 %.1f 입니다\n", bmi);
        System.out.println(bodyMass + "입니다.");
        System.out.println("================= BMI 계산기 =================");
    }
}

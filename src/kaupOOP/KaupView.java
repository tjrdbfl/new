package kaupOOP;

public class KaupView {  //메소드 3개
    static String test;
    public static void main(String[] args) {

        Person person=new Person();

        person.createRandomTall();
        person.createRandomWeight();

        double randomTall = person.getRandomTall();
        double randomWeight = person.getRandomWeight();

        person.setHeight(randomTall);
        person.setWeight(randomWeight);
        person.setName("홍길동");
        person.createBMI();
        person.createBodyMass();

        System.out.println("================= BMI 계산기 =================");
        System.out.println("이름: "+person.getName());
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("BMI는 %.1f 입니다\n", person.getBmi());
        System.out.println(person.getBodyMass() + "입니다.");
        System.out.println("================= BMI 계산기 =================");
    }
}

package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Member {
    private String id;
    private String pw;
    private String pwAgain;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;  //초기화 선언 x
    private double weight;
    private double randomTall;
    private double randomWeight;

    //카우프 지수에서 사용하는 생성자
    public Member(double height,double weight){
        this.height=height;
        this.weight=weight;
    }

    public Member() {

    }
    //회원가입 에서 사용하는 생성자


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getRandomTall() {
        double randomTall = (150 + Math.random() * 50);
        this.randomTall = Math.floor(randomTall * 10) / 10;
        return this.randomTall;
    }

    public double getRandomWeight() {
        double randomWeight = (30 + Math.random() * 70);
        this.randomWeight = Math.floor(randomWeight * 10) / 10;
        return randomWeight;
    }


    public Member(String id, String pw, String pwAgain
            , String name, String personId, String phoneNumber
            , String address, String job) {
        this.id = id;
        this.pw = pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;

    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

package kaupOOP; //같은 패키지 내에서 public의 import문을 생략하는 기능

public class Person {   //Model
    private double height;  //초기화 선언 x
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;
    private double randomTall;
    private double randomWeight;

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public void createBMI(){
        this.bmi=weight/Math.pow(height/100,2);
    }
    public double getBmi() {
        return this.bmi;
    }

    public void createBodyMass() {
        String bodyMass=null;

        if(bmi<18.5){
            bodyMass="저체중";
        }else if(bmi<23){
            bodyMass="정상";
        }else if(bmi<25.00){
            bodyMass="과체중";
        }else{
            bodyMass="비만";
        }

        this.bodyMass = bodyMass;
    }
    public String getBodyMass() {
        return this.bodyMass;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void createRandomTall(){
        double randomTall= (150 + Math.random() * 50);
        this.randomTall=Math.floor(randomTall * 10) / 10;
    }

    public double getRandomTall() {
        return this.randomTall;
    }

    public void createRandomWeight(){
        double randomWeight= (30 + Math.random() * 70);
        this.randomWeight=Math.floor(randomWeight * 10) / 10;
    }
    public double getRandomWeight(){
        return randomWeight;
    }


}

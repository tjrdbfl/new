package kaupOOP;

import memberOOP.Member;

public class KaupServiceImpl implements KaupService{
    Member member=new Member();

    @Override
    public double createBMI() {
        double bmi= member.getWeight() /Math.pow(member.getHeight() /100,2);
        return bmi;
    }

    @Override
    public String createBodyMass() {
        String bodyMass=null;
        double bmi=this.createBMI();

        if(bmi<18.5){
            bodyMass="저체중";
        }else if(bmi<23){
            bodyMass="정상";
        }else if(bmi<25.00){
            bodyMass="과체중";
        }else{
            bodyMass="비만";
        }

        return bodyMass;

    }
}

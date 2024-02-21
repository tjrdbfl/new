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

        public Member(String id,String pw,String pwAgain
                ,String name,String personId,String phoneNumber
        ,String address,String job){
            this.id = id;
            this.pw=pw;
            this.pwAgain=pwAgain;
            this.name=name;
            this.personId=personId;
            this.phoneNumber=phoneNumber;
            this.address=address;
            this.job=job;

        }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", pwAgain='" + pwAgain + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

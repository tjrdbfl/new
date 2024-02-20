package gradeOOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        MultiDimensional multiDimensional=new MultiDimensional();

        System.out.println("다음은 한 학생의 과목 점수이다.");

        System.out.println("이름 : ");
        multiDimensional.setName(sc.next());

        System.out.println("국어점수 : ");
        multiDimensional.setKorean(sc.nextInt());

        System.out.println("영어점수 : ");
        multiDimensional.setEnglish(sc.nextInt());

        System.out.println("수학점수 : ");
        multiDimensional.setMath(sc.nextInt());

        System.out.println("평균 점수를 구하시오");
        multiDimensional.createAvg();

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : "+multiDimensional.getName());
        System.out.println("국어점수 : "+multiDimensional.getKorean());
        System.out.println("영어점수 : "+multiDimensional.getEnglish());
        System.out.println("수학점수 : "+multiDimensional.getMath());
        System.out.println("평균 점수: "+multiDimensional.getAvg());

    }
}
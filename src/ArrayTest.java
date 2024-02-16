
import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest {
    /*
     * 최적화 문제 중 최댓값 구하기
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxIndex=0;

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");
        System.out.println("시험에 응시한 학생수는 몇 명입니까?");
        int[] scores = new int[sc.nextInt()];
        String[] name=new String[scores.length];

        for (int i = 0; i < scores.length ; i++) {
            System.out.println("이름 입력: ");
            name[i]=sc.next();
            System.out.println("점수 입력: ");
            scores[i]=sc.nextInt();

            if (max < scores[i]) {
                max = scores[i];
                maxIndex=i;
            }
        }

        System.out.println("1등 학생 이름은 "+name[maxIndex] +"이고 점수는 "+ max + "이다.");
    }

}
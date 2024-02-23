package matrixTest;

import java.util.Random;

/*
* [로또 프로그램]
1. 서로 겹치지 않는 숫자 6개를 생성
2. 각 숫자는 1 ~ 45 범위 내의 숫자
3. 매번 실행 시 다른 숫자 출력
4. 오름차순 정렬 -> 랜덤수 : Math 사용

* 결과)
로또 번호
-------------------
2 11 25 27 35 38
-------------------
*
* */
public class Lotto {

    public static void main(String[] args) {

        int[] arr=new int[6];

        // 중복 없이 6개 element를 가진 배열 생성
        arr=createArrayWithoutDuplication(arr);

        // 배열 정렬
        arr=sortAscending(arr);

        // 배열 출력
        printArr(arr);




    }

    private static void printArr(int[] arr) {
        System.out.printf("결과)\n"
                +"-------------------\n"
                +"로또 번호\n"
                +"-------------------\n");

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }

    private static int[] sortAscending(int[] arr) {
        //swap
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    private static int[] createArrayWithoutDuplication(int[] arr) {
        for(int i=0;i<6;i++){
            int randomNumber=createRandomNumber(1,45);
            boolean check=false;
            for(int j=0;j<6;j++){
                if(arr[j]==randomNumber){
                    check=true;
                }
            }
            if(check==false){
                arr[i]=randomNumber;
            }else{
                i--;
            }
        }
        return arr;
    }

    private static int createRandomNumber(int start, int end) {
        Random random=new Random();
        return random.nextInt(end)+start;
    }


}

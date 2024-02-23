package matrixTest;
/*
* [로또 당첨 프로그램]
1. 로또 발급은 1~8까지 중복없는 숫자 6개.

2. 하나는 구매한 로또이다. 추가된 로직은 추첨된 로또이다.

3. 로또의 일치 여부에 따라 다음과 같은 메세지를 출력한다.
<추첨>
1등: 6개 맞추기
2등: 5개 맞추기
3등: 4개
4등: 3개
꼴등: 2개 이하

4. 단 구매로또 번호와 추첨 로또 번호 모두 같이 출력한다.
* */

import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        int[] winningArr=new int[6];

        // 중복 없이 6개 element를 가진 배열 생성
        arr=createArrayWithoutDuplication(arr);
        winningArr=createArrayWithoutDuplication(winningArr);

        // 배열 정렬
        arr=sortAscending(arr);
        winningArr=sortAscending(winningArr);

        // 배열 출력
        printArr(arr,winningArr);

        // 로또 일치 여부 + 당첨 결과 출력
        printWinning(countResult(arr,winningArr));
    }

    private static void printWinning(int count) {
        System.out.printf("\n-----------------------\n"
        +"결과) ");

        switch (count){
            case 6:
                System.out.printf("1등: %d개 맞추기\n",count);
                break;
            case 5:
                System.out.printf("2등: %d개 맞추기\n",count);
                break;
            case 4:
                System.out.printf("3등: %d개 맞추기\n",count);
                break;
            case 3:
                System.out.printf("4등: %d개 맞추기\n",count);
                break;
            default:
                System.out.printf("꼴등: %d개 이하\n",count);
                break;
        }
    }

    private static int countResult(int[] arr, int[] winningArr) {
        int cnt=0;

        for(int i=0;i<6;i++) {
            for(int j=0;j<6;j++) {
                if (arr[i] == winningArr[j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private static void printArr(int[] arr1,int[] arr2) {
        System.out.printf("-----------------------\n"
                +"로또 번호: ");

        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }

        System.out.printf("\n-----------------------\n"
                +"추첨 번호: ");

        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
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
            int randomNumber=createRandomNumber(1,8);
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

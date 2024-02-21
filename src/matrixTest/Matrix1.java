package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix= new int[5][5];
        int k=1;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=k++;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int adder(int k){
        return k++;
    }
}

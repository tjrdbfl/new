package matrixTest;

public class Matrix2View {
    private int[][] matrix;
    private int n;

    public int getN() {
        return n;
    }

    public int setN(int n) {
        this.n = n;
        return n;
    }

    public void createMatrix(int n) {
        int x=this.n;
        int k=1;
        int[][] matrix=new int[x][x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)    {
                matrix[j][i] = k;
                k++;
            }
        }

        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void printMatrix(int[][] arr){
        int[][] matrix=this.matrix;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}

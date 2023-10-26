package Array_list;

public class TrasportMatrix {

    public static int[][] trsaportMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int [][] ans = new int[n][m];

        for(int i = 0; i<n; i++){
            for (int j=0;j<m;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result[][] = trsaportMatrix(matrix);

        for(int i =0; i<result.length;i++){
            for(int j=0; j<result[0].length;j++){
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }

    }
    
}

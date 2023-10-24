package Array_list;

public class CellWithOdd {
    static int[][] oddCells(int m, int n, int[][] indieces){
        int [][] ans = new int[m][n];

        for(int row = 0; row<indieces.length;row++){
            for(int col =0; col<n;col++){
                 ans[indieces[row][0]][col]++; 
            }
            for(int i = 0; i<m;i++){
                ans[i][indieces[row][1]]++;
            }
        }
        return ans;
    }
    static void printOdd(int m, int n, int[][] ans){
        int count = 0;
        for (int i=0 ; i < m; i++) {
            for(int j = 0; j<n;j++){
                if(ans[i][j] % 2 !=0){
                    count++;
                }
            }
        }
        System.out.println(" This is odd count: "+count);
    }
    public static void main(String[] args) {
        int[][] indieces = {
                { 0, 1 },
                { 1, 1 }
        };
        int m = 2;
        int n = 3;

        
        int[][] result = oddCells(m, n, indieces);
        printOdd(m, n, result);


    }

}

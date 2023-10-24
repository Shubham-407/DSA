package Array_list;

public class FlipImg {
    public static int[][] flipImage(int num[][]){
        int m = num.length;
        int n = num[0].length;

        for(int row = 0; row < m; row++){
            for(int col = 0; col <= (n+1)/2; col++){
                int temp = num[row][col]^1;
                num[row][col] = num[row][n - col -1] ^1;
                num[row][n - col - 1] = temp;
        }
    }
        return num;

    }
    public static void main(String[] args) {
        int num[][] = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        int[][] result = flipImage(num);
    for(int i = 0; i<result.length;i++){
        for(int j = 0; j<result[0].length;j++){
            System.out.print(result[i][j]+", ");
        }
        System.out.println();
    }
        
    }
    
}

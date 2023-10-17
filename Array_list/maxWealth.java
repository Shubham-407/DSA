package Array_list;

public class maxWealth {

    static int wealth(int arr[][]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j =0; j<arr[i].length;j++){
                sum += arr[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(wealth(arr));
    }

}

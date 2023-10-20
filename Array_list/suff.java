package Array_list;

public class suff {
    static int[] ArrSuff(int nums[], int n){

        int ans[] = new int[n*2];
        int j =0;
        
        for(int i = 0; i<nums.length-1; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n = 3;

        int result[] = ArrSuff(nums, n);
        for(int i = 0; i<result.length;i++){
        System.out.print(result[i]+", ");
        }

    }
    
}

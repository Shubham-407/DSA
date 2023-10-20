package Array_list;

public class smallerInArray {
    static int[] smallerNumbersThanCurrent(int nums[]){
        int ans[] = new int[nums.length];

        for(int i = 0; i<nums.length;i++){
            int count = 0;
            for(int j = 0; j<nums.length;j++){
                if (nums[j] < nums[i]){
                    count++;
                    ans[i] = count;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};

        int result[] = smallerNumbersThanCurrent(nums);

        for(int i = 0; i<nums.length;i++){
            System.out.print("Number " + nums[i]+" : "+result[i]+" ");
        }
    }
    
}

package Array_list;

public class concatArr {

    static void contact(int nums[]){
        int n = nums.length;
        int ans[] = new int[n*2];

        for(int i = 0; i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        for(int a:ans){
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1};

        contact(nums);

    }
    
}

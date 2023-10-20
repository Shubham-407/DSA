package Array_list;

public class target {
    static int[] target(int nums[], int index[]){
        int target[] = new int[nums.length];
        for(int i =0; i<index.length;i++){
            for(int j = target.length-1;j>index[i];j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
    public static void main(String[] args) {
        int nums[] ={0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int result[] = target(nums, index);

        for(int r: result){
            System.out.print(r+" ");
        }

    }
    
}

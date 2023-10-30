package Array_list;

public class EvenNumberDigit {
    static int findNumber(int[] nums){
        int count = 0;

        for(int i = 0; i<nums.length;i++){
            int digit = 0;
            while(nums[i] > 0){
                digit++;
                nums[i] /= 10;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums ={555,901,482,1771};

        System.out.println("Count of even number digits: "+findNumber(nums));
    }
    
}

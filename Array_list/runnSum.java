package Array_list;

public class runnSum {
    static int[] sum(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };

        int result[] = sum(nums);

        for (int a : result)
            System.out.print(a + ", ");
    }

}

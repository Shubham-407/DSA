package Array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayForm {
    public static List<Integer> addToArrayform(int []nums, int k){
        int n = nums.length;
        int i = n -1;

        List<Integer> list = new ArrayList<>();
        while(i>=0 || k>0){
            if(i>=0){
                list.add((nums[i]+k)%10);
                k = (nums[i]+k)/10;
            }
            else{
                list.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(list);
        return list;
        

    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 0, 0};
        int k = 34;
        List<Integer> list = new ArrayList<>(addToArrayform(nums, k));
        for (Integer arr : list) {
            System.out.print(arr+" ");
        }

    }
    
}

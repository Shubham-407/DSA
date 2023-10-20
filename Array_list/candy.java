package Array_list;

import java.util.ArrayList;
import java.util.List;

public class candy {
    static List<Boolean> kidwithcandies(int arr[], int extracandies) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean test = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + extracandies < arr[j]) {
                    test = false;
                    break;
                }
            }
            if (test) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 3 };
        int extracandies = 3;

        List<Boolean> result = kidwithcandies(arr, extracandies);

        for (boolean r : result) {
            System.out.print(r+" ");
        }

    }

}

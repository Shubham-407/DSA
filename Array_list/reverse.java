package Array_list;

import java.util.Arrays;

//Two pointer method
public class reverse {

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Original array is :");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

}

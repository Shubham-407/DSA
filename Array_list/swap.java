package Array_list;

public class swap {

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5}; 
                // 0 1 2 3 4

            swap(arr, 1, 4);
            for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
    
}

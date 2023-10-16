package Array_list;

public class max {
    static void maxi(int arr[]){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if( arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println(max+" this is maximum value in array");
    }
    public static void main(String[] args) {
        
        int arr[] ={ 3, 5, 76, 90, 9};

        maxi(arr);
    }
    
}

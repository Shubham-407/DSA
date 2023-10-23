package Array_list;

public class HighestAlti {

    public static int largestAltitude(int gain[]){
        int max =0;
        int current = 0;

        for(int i = 0; i<gain.length;i++){
            current += gain[i];
            max = Math.max(max, current);
        }
        return max;
    }
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};

        int result = largestAltitude(gain);

        System.out.println("The highest altitude is "+result);

    }
    
}

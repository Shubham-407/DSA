package Array_list;

public class permutation {

    static void permu(int num[]) {

        int ans[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }

        for(int i  = 0; i<num.length;i++){
            System.out.print(ans[i]+", ");
        }
        
    }

    public static void main(String[] args) {
        int num[] = { 0, 2, 1, 5, 3, 4 };
        permu(num);
    }

}

package Array_list;

public class pangram {
    static boolean pangramStr(String str){

        boolean mark[] = new boolean[26];
        for(int i =0; i<str.length();i++){
            char c=str.charAt(i);
            
            if ('A' <= c && c <= 'Z') {
                mark[c - 'A'] = true;
            } else if ('a' <= c && c <= 'z') {
                mark[c - 'a'] = true;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // String str  = "thequickbrownfoxjumpsoverthelazydog";
        String str = "leetcode";
        boolean result =  pangramStr(str);

        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}

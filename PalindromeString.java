public class PalindromeString {
    public static void main(String[] args) {
        String s = "abba";
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            str = str + ch;
        }
        if (s.equals(str)) {
            System.out.println(s + " is palindrome string");
        }else{
            System.out.print(s+" not a Palindromic string");
        }
    }

}

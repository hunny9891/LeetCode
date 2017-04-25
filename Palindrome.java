package strings;

public class Palindrome {
    public boolean isValidPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("\\W", "");
        
        if(s.length() <= 1) return true;
        return s.charAt(0) == s.charAt(s.length() - 1) && isValidPalindrome(s.substring(1, s.length() - 1));
    }
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\W", "");
        
        boolean result = true;
        int front = 0;
        int back = s.length() - 1;
        
        while(front <= back) {
            result = result && s.charAt(front) == s.charAt(back);
            front++;
            back--;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String s = ",; W;:GlG:;l ;,";
        long start = System.currentTimeMillis();
        System.out.println(palindrome.isPalindrome(s));
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time ----> " + (end - start));
    }

}

//check string is palindrome or not.

public class palindromestring{
    public static boolean ispalindrome(String str){
         int n = str.length();
          for(int i = 0 ; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not palindrome
                 return false;
            }

          }
          //palindrome
          return true;
    }

    public static void main(String args[]){
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
}
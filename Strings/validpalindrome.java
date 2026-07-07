/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

*/

public class validpalindrome {
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[] ){
        String s = "race a car";
        System.out.println((isPalindrome(s)));
    }
}

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
/*Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false*/

//t(C) = O(n) and s(C) = O(1)


public class validAnagram{
    public static boolean isAnagram(String s, String t){
         // Agar dono strings ki length alag hai
        if(s.length()!=t.length()){
             return false;
        }

       // a-z ke liye 26 size ka array
        int count[] = new int[26];

         // Ek hi loop me count increase aur decrease
        for(int i = 0; i< s.length(); i++){

            // s ke character ka count +1
            count[s.charAt(i) -'a']++;

            // t ke character ka count -1
            count[t.charAt(i)- 'a']--;
        }
          
        // Agar kisi bhi character ka count 0 nahi hai 
        for(int i = 0 ;i<26; i++){
            if(count[i]!= 0){
                return false;
            }
        }

        // Sab count 0 hain
        return true;
    }

    public static void main(String  args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}



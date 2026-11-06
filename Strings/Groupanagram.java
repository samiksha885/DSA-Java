// Group anagram  T(C) = O(n*k)

import java.util.*;

public class Groupanagram{
   public String getHash(String s) {
       StringBuilder hash = new StringBuilder();
       int[] freq = new int[26];


       for (char ch : s.toCharArray()) {
           freq[ch - 'a']++;
       }


       for (int i = 0; i < 26; i++) {
           if (freq[i] != 0) {
               hash.append(freq[i]);
           }
           hash.append("$");
       }


       return hash.toString();
   }


   public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
       HashMap<String, List<String>> mp = new HashMap<>();


       for (int i = 0; i < strs.length; i++) {
           String key = getHash(strs[i]);
           if (!mp.containsKey(key)) {
               mp.put(key, new ArrayList<>());
           }
           mp.get(key).add(strs[i]);
       }


       for (List<String> group : mp.values()) {
           res.add(group);
       }


       return res;
   }

      public static void main(String[] args){
     String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
     Groupanagram obj = new Groupanagram();

     System.out.println("Input: " + Arrays.toString(strs));

     System.out.println("Output: " + obj.groupAnagrams(strs));
      

   }
   
}

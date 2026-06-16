/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */













/*bruth force approach t(c) => 0(n^2)*/

    /*public class majorityelement {
    public static int getmajority(int[] nums){
       for(int i = 0; i<nums.length;i++){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] ==  nums[i]){
                    count++;
                }
                
            }

               if(count>nums.length/2){
                    return nums[i];
        }
    }
         return -1;

    }

    public static void main(String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(getmajority(nums));
    }
}*/





/*optimal aprroach t(c) => o(nlogn+n) */



/*import java.util.Arrays; // Sahi import

public class majorityelement {
    public static int getmajority(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums); // Array ko sort kiya: {1, 1, 1, 2, 2, 2, 2}

        int freq = 1 ;
        
        // Loop 1 se start hoga taaki i-1 check kar sakein
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                 freq = 1;// Agar naya number mila toh count reset
            }

            if (freq > n / 2) {
                return nums[i];
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element is: " + getmajority(nums));
    }
}
*/


/*moore's voting algo */ 
//t(c) => o(n) s(c) => o(1)


public class majorityelement {
    public static int getmajority(int[] nums){
        int freq = 0; 
        int ans = 0;
       for(int i = 0; i<nums.length;i++){
        if(freq==0){
            ans = nums[i];
        }
        if(ans == nums[i]){
            freq++;
        }else{
            freq--;
        }
    }
       return ans;
    }
 public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element is: " + getmajority(nums));
    }

}
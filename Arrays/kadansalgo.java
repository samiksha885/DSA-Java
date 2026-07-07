/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 
t(C) = o(n),s(c) = o(1)*/

public class kadansalgo {
    public static void kadans(int numbers[]){
        int cs = 0 ;
        int ms = Integer.MIN_VALUE;

        for(int  i = 0 ; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0; 
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Maximum sum is : " + ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadans(numbers);
    }
}

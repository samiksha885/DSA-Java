// 1004. Max Consecutive Ones III
// 
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.
// 0 <= k <= nums.length



// t(C) = O(n^2) brute force

// public class maxconsecutiveoneIII{
//     public static int maxConsecutive(int[] nums,int k){
//         int n = nums.length;
       
//         int maxCount = 0;

//         for(int i = 0; i<n; i++){
//              int countZero = 0;
//             for(int j=i; j<n; j++){
//                  if(nums[j] == 0){
//                     countZero++;
//                  }
//                  if(countZero>k){
//                     break;
//                  }
//                  maxCount = Math.max(maxCount,j-i+1);
//             }
          
//         }
//         return maxCount;


//     }
//     public static void main(String args[]){
//         int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
//         int k = 2;
//         System.out.println(maxConsecutive(nums, k));

//     }
// }


// better approach
// t(c) = O(2n)

// public class maxconsecutiveoneIII{

//     public static int maxConsecutive(int [] nums,int k){
//         int left = 0;
//         int maxCount = 0;
//         int zeroCount = 0;
//         int n = nums.length;


//         for(int right =0; right<n; right++){
//             if(nums[right]== 0){
//                 zeroCount++;
//             }
//             while(zeroCount > k){
//                 if(nums[left] == 0){
//                     zeroCount--;
//             }
            
               
//               left++;

//             }
    
//             maxCount = Math.max(maxCount,right-left+1);

//           }

//               return maxCount;

//           }
      
//     public static  void main(String args[]){
//           int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
//            int k = 2;
        
//          System.out.println(maxConsecutive(nums,k));
//     }
// }

//optimal code T(C) = O(n)
public class maxconsecutiveoneIII {
   public static int maxConsecutive(int [] nums,int k){
        int left = 0;
        
        int zeroCount = 0;
        int n = nums.length;


        for(int right = 0; right<n; right++){
            if(nums[right] == 0){
                zeroCount++;
            }

            if(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
        
                left++;
        }
        }
        return n-left;
}


public static  void main(String args[]){
          int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
           int k = 2;
        
         System.out.println(maxConsecutive(nums,k));
    }
}






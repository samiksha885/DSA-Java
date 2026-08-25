//  Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]


//brute force; t(c) = o(n^2) , s(c) = o(n^2);

// for(int i = 0 ; i<n; i++){
//     for(int  j = 0 ; j<n; j++){
//         if(i!=j){
//           ans[i] = ans[i] * nums[i];

//         }

//         return ans;
//     }
// }
import java.util.Arrays;

public class productofaaray{
    public static int[] productofarrayselfexcept(int nums[]){
        int n = nums.length;
        int[]ans = new int[n];
        Arrays.fill(ans,1);

        //prefix
        for(int i = 1 ; i<n; i++){
            ans[i] = ans[i-1] * nums[i-1];

        }

        //suffix
        int suffix = nums[n-1];
        for(int i = n-2; i>=0; i--){
          ans[i] = ans[i] * suffix;
          suffix = suffix * nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        int[] result = productofarrayselfexcept(nums);

        System.out.println(Arrays.toString(result));
    }
}

// t(c) = o(n), s(c) = o(1)
//patterns = prefix sum / arrays
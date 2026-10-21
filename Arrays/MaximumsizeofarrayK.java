// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
// Note: A subarray is a contiguous part of any given array.
// t(c) = o(n); s(c) = o(1)


public class MaximumsizeofarrayK{

    public static int maxsubarraySum(int []arr,int k){
        int n = arr.length;
        if(n < k || k <= 0){
            return -1;
        }

        int windowSum = 0;
        
        //first k element sum
        for(int i = 0 ;i<k; i++){
             windowSum += arr[i];
             
            }
           int  maxSum = windowSum;

        //slide the window
        for(int i = k; i<n; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }

    return maxSum;
    }
    
       public static void main(String[] args) {
        int[] arr = {4,2,6,8,10};
        int k = 2;

        int result = maxsubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
        // Output:18
    }
}
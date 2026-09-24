//Sort colors - 75 



// brute force = by using sorting and ibulit sort T(C) = O(nlong) S(C) = O(1)



// Optimized soltuion 


   //   count0 = 0, count1 = 0, count2 = 0;

   // for(int i = 0 ; i<n; i++){
   // if(nums[i] == 0){
   // count0++;
   // }


   // elseif(nums[i] == 1){
   // count1++;


   // else{
   //     count2+++;
   // }


   // }


   // int idx = 0 ;


   // for(int i = 0;i<count0; i++){
   // nums[idx++] = 0;
   // }


   // for(int i = 0; i<count1; i++){
   //     nums[idx++] = 0;
   // }

   // for(int i = 0; i<count2; i++){
   //     nums[idx++] = 0;
   // }

   //   T(C) = O(2n) = > O(n) ,S(C) = O(1)


// optimal solution -  dutch national flag algorithm(3 pointers)
// T(C) = O(n) ,S(C) = O(1)


import java.util.Arrays;

public class Sortcolors{

    private  static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[]nums){
        int low = 0 ;
        int mid = 0;
        int n = nums.length;
        int high = n-1;



        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid); //move  0 to the begging
                    mid++;
                    low++;
            } else if(nums[mid] == 1){// Leave 1 in place
                mid++;
            }else{
              swap(nums,high,mid);    // Move 2 to the end
              high--;
        }
      }
    }

    
    public static void main(String args[]){
          int[] nums = {2, 0, 2, 1, 1, 0};
            sortColors(nums);
          System.out.println("Sorted colors: " + Arrays.toString(nums));
    }
}
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.*/



public class Removeduplicate {
    public static int removeduplicates(int[] nums){
        int i = 0;
        for(int j= 1;j<nums.length; j++){
            if(nums[j]!= nums[i]){
                nums[i+1] = nums[j];
                i++;
                nums[i] = nums[j];
            }
        }
        
        return (i+1);
    }


    public static void main(String args[]){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeduplicates(arr));
    }
}

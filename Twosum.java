//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

public class Twosum{
    public static int[] twosortedsum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
        int CurrSum = arr[left] + arr[right];
        if(CurrSum == target){
            return new int[] {left, right};
      } else if(CurrSum < target){
            left++;
    } else{
            right --;
        }
    } return new int[] {-1,-1};
        
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,5,7,10,11,15};
        int target = 15;
        int result[] = twosortedsum(arr, target);
        System.out.println(" indices"+ "(" + result[0] + "," + result[1] + ")");
    }
}
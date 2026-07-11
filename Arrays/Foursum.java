
/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Foursum {
    public List<List<Integer>> foursortedSum(int[] nums, int target) {
        if(nums == null || nums.length<4) {
            return new ArrayList<>();
        }
           Arrays.sort(nums);

           Set<List<Integer>> result = new HashSet<>();
           for(int i=0;i<nums.length-3; i++){
              for(int j= i+1; j<nums.length-2;j++){
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int Currsum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(Currsum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(Currsum<target){
                        left++;
                    }
                    else{
                        right--;

                    }
                }
              }
           }
              return new ArrayList<>(result);
}

    public static void main(String[] args) {
        Foursum obj = new Foursum();
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(obj.foursortedSum(arr,target));
}
}

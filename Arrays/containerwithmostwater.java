/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.*/


public class containerwithmostwater {
          public static int MaxArea(int [] height ){
            int MaxWater = 0;
            int left = 0;
            int right = height.length-1;
            while(left<right){
                int ht= Math.min(height[left] , height[right]);
                int width = right -left;
                int CurrWater = ht*width;
               MaxWater = Math.max(CurrWater, MaxWater);
              if(height[left]< height[right]){
                left++;
              }
              else{
                right--;
              }

            }

            return MaxWater;
        }



    public static void main(String args[]){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(MaxArea(arr));
    }
}

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/
/*bruth force approach  t(c) => 0(n^2)*/
 public class moveszerotoend {

   /*  public static void movezero(int[] arr){
        for(int i=0;i<arr.length-1; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== 0 && arr[j]!= 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
    }
    public static void main(String []args){
        int nums[] = {1,2,0,4,0,3,0,2};
    movezero(nums);

          for(int num : nums){
        System.out.print(num + " ");
}
    }
}*/


/*optimal appraoch */

public static void movezero(int[] arr){
    int j = 0;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
}


    public static void main(String []args){
        int nums[] = {1,2,0,4,0,3,0,2};
          movezero(nums);

          for(int num : nums){
        System.out.print(num + " ");
}
    }
 }
   
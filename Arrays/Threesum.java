import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Threesum {

    public List<List<Integer>> threeSum(int[] arr) {

        if(arr == null || arr.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(arr);

        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < arr.length - 2; i++){

            int left = i + 1;
            int right = arr.length - 1;

            while(left < right){

                int currSum = arr[i] + arr[left] + arr[right];

                if(currSum == 0){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                }
                else if(currSum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        Threesum obj = new Threesum();

        int arr[] = {-1,0,1,2,-1,-4};

        System.out.println(obj.threeSum(arr));
    }
}




public class binarySearch {
       public static int binary_Search(int numbers[], int key){
       int start = 0, end = numbers.length-1;
       while(start<=end){
        int mid  = (start + end)/2;
        if(numbers[mid] == key){ //found //comparing the mid element with key
            return mid;
        }
        else if(numbers[mid] < key){//if mid element is less than key then we will search in right half
            start = mid + 1;
        }
        else{//if mid element is greater than key then we will search in left half
            end = mid - 1;
        }
       }
       return -1; //if key is not found in the array.
    }



    public static void main(String args[]){
        int numbers [] = {2,4,6,8,10,12,14};
        int key = 12;
        System.out.println("indexx for key is : " + binary_Search(numbers, key));
    }
}
//tc = O(log n) because we are halving the search space in each iteration.
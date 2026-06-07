public class linearSearch{
   public static int linearsearch(int num[],int key){
       for(int  i = 0; i<num.length;i++){
         if(num[i] == key){
            return i;
         }
       }
        return -1; 
   }

   public static void main(String[] args){
      int num[] = {2,4,6,7,8,9,1,2,3,6,8};
      int key = 6;
      int index = linearsearch(num, key);
      if(index == -1){
         System.out.println("Element not found");
      } else{
         System.out.println("Element found at index: " + index);
      }
   }
}

//tc = O(n) because in worst case we have to traverse the entire array.
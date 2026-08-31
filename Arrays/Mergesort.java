public class Mergesort{
    //for print array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //mergesort recursive call
    public static void mergeSort(int arr[] , int si,int ei){
        //basecase
        if(si>=ei){
            return;
        }

      //kaam
      int mid = si + (ei-si)/2;//(si+ei)/2

      mergeSort(arr,si,mid);//left
      mergeSort(arr, mid+1, ei);//right

      merge(arr,si,mid,ei);

    }

    public static void merge(int arr[], int si,int mid,int ei){
        //left(0,3)= 4 right(4,6) = 3 => 4+3 = 6-0+1=>7 arrray me 0 based indexing hoti hai islye size me +1 karna padta hai
        int temp[]= new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0;//for temp;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; //agle index par pahuch gye
            }else{  //right part se value temp me add karni hai
                temp[k] = arr[j] ;
                j++;

            }
              k++;
        }


        //leftover elemnet ke liye
       //left
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right
        while(j<=ei){
            temp[k++] = arr[j++];
        }


        //copy temp to original arry
        for(k = 0,i=si; k<temp.length;k++,i++){
          arr[i]= temp[k];
        }


    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
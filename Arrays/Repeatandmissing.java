//find Repeating and Missing value.
// T(C) = > O(n^2)


import java.util.HashSet;

public class Repeatandmissing{
    public static  int[] findrepeatandMissingnumber( int [][] grid){

        int n = grid.length;
        int N = n*n;
        int a = -1;
        int b = -1;
        
        //hashset
        HashSet<Integer>s = new HashSet<>();

        int actualSum = 0;

        for(int i = 0; i<n; i++){
           for (int j = 0; j<n; j++){
             int nums = grid[i][j];

             //actaual sum
             actualSum += nums;


             //repeat value

             if(s.contains(nums)){
                a = nums;

             }

                //add to hashset
                 s.add(nums);
            }
        }

                 //expexted sum
                 int expSum = N * (N+1) /2;


                 b  = expSum + a - actualSum;

             return new int[] {a ,b };
    }


    public static void main(String args[]){
        int[][] grid = {{1,3} ,{2,2}};
        int[] res = findrepeatandMissingnumber(grid);

        System.out.println("Repeating number is : " + res[0]);
        System.out.println("Missing number is : " + res[1]);



    }
}
// Seach in sorted matrix ||

// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.
 

// T(c) = O(n + m)
// optimized solution
public class Searchinmatrix2{
    public static  boolean searchMatrix(int[][] matrix , int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 ){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0 ;
        int c = m-1;


        while(r < n && c >= 0){
            if(target == matrix[r][c]){
                return true;
            }
            else if(target < matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }

        return false;
    }


    public static void main(String args[]){
       int[][] matrix = {{1,4,7,11,15} , {2,5,8,12,19},{3,6,9,16,22} ,{10,13,14,17,24} ,{18,21,23,26,30}};
       int target = 5;

       System.out.println(searchMatrix(matrix, target));
    }
}
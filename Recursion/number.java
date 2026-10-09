public class number {
   
 //printnumber in increasing order.
    public static void printIncre(int n){
        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        printIncre(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
         int n = 10;
         printIncre(n);
    }  
}
// // class Solution {
//     public double myPow(double x, int n) {
//         long binForm = n ;
//         double ans = 1;
//         if(n<0){
//             x = 1/x;
//             binForm = -binForm;
//         }
//         while(binForm>0){
//           if(binForm % 2==1){
//             ans = ans*x;

//           }
//           x *= x;
//           binForm /= 2;

//         }
//          return ans;
//     }
    
// }
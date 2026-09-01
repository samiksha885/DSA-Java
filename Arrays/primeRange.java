//check a number is prime or not and print all the prime number in a range.

public class primeRange {

        public static boolean isPrime(int n){
            if(n==2){
                return true;
            }
       
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n %i ==0){
                return false;
            }
        }
        return true;
       }
    public static void primeInRnage(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]){
        primeInRnage(20); // prime hai 2 to 10
    }
}

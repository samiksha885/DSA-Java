public class Tillingproblem{
    public static int tilling(int n){ // 2 x n ka floor

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        // vertical choices
        int fnm1 = tilling(n-1);

        //horizontal choices
        int fnm2 = tilling(n-2);

        //total ways to fill the floor
        int totalWays = fnm1 + fnm2;

        //return the totalways
        return totalWays;

    }


    public static void main(String args[]){
        int n = 4;
        System.out.println(tilling(n));
    }
}
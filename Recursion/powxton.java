//x ^ n 

 public class powxton {
    public static int power(int x , int n)//(o(n))
    {
        if(n == 0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x *  xnm1;
        // return xn;
        return x * power(x , n-1);
   }


    //more optimized code
    public static int optimizedPower(int a , int n ){///o(logn)
    if(n == 0 ){
        return 1;
    }
    int halfpower = optimizedPower(a, n/2);
    //n is even
    int halfPowersq = halfpower * halfpower;

    //n is odd

    if(n % 2 != 0 ){
    halfPowersq = a * halfPowersq;
    }

      return halfPowersq;
    }

    public static void main(String args[]){
        int a = 2;
        int n = 10;


       System.out.println(optimizedPower(a,n));
    }
}





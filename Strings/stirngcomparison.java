
public class stirngcomparison {
    public static void main(String args[]){
        //value check karne ke liye string .equals function ka use hota hai.
        String s1 = "tony";
        //String s2 = "tony";
        String s3 = new String("tony");
        if(s1.equals(s3)){
            System.out.println("string are equals");
        } else{
            System.out.println("string are not equals");
        }
    }
}
    //(==) ka use obejct level par check karta hai ki same hai ya nhi.

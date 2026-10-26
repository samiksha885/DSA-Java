
public class Stringfunction {
    //substring - string ka chota part 
    //continous hissa string ka jo uska chota part form karna hai
    // isme string index aur ending index hota hai ending index excluded hota hai.

    public static String substring(String str , int si , int ei){
        String substr = " ";
        for(int i = 0 ; i<ei; i++){
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String args[]){
        //substring
        String str = "HelloWorld";
        System.out.println(substring(str , 0 ,5));
    }
}

//java me inbuilt function hota hai .substring naam ka 
//System.out.println(str.substring(0,5));

// Compression of String using StringBuilder.

// T(C) = O(n) and S(C) = O(n)
public class Stringcompression {
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder();

        for(int i= 0 ; i<str.length();i++){
            Integer count = 1;

            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

            }

            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }

        return sb.toString();
    }


public static void main(String args[]){
    String str ="aaabbccdd";
     System.out.println(stringCompression(str));
}
}

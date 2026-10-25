
public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(" ");
        for(char ch ='a'; ch <='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}


//stringbuilder declaration = StringBuilder sb = new Stringbuilder("");
//stringbuilders = ek baar bana fir usi me change kar skate hai.
//.append()= string ke piche add karte jana.
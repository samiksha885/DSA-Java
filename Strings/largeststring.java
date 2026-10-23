

public class largeststring {
    //.compareTo = do string compare karne ke liye.
    //.comparetoIgnoreCase = captial aur small igonre karne ke liye.
    public static void main(String args[]){
        String fruits[] = {"apple", "banana","grpas", "gavav","dragonfruits" };
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
             if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
             }
        }
        System.out.println(largest);
    }
}
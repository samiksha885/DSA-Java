//pairs in  an array

public class pairsArray {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];//2,,4,6,8,10
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("("+ curr +","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }


public static void main(String args[]){
    int numbers[] = {2,4,6,8,10};
    printPairs(numbers);
}
}

//tp = n(n-1)/2 because for each element we are parining it with n-1 elements and we have n elemmnt in the aaray.
//tc = O(n^2) because we have two nested loops, each iterating over the array.

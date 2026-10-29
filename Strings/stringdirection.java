//given a route containing 4 direction (E,W,N,S) find the shortest path to reach the destiontion.

public class stringdirection {
    public static float getShortestpath(String path){
        int x=0; 
        int y = 0;
         for(int i = 0 ; i<path.length(); i++){
           char dir = path.charAt(i);
            //east E = x+1
            if(dir == 'E'){
                x++;
         }
            //west W = x-1
             else if(dir == 'W'){
                x--;
       }//north N = y+1
             else if(dir == 'N'){
                y++;
                //south S= y-1
             }else{
                y--;
             }
        }
             int X2 = x*x;//x^2 = X2
             int Y2 = y*y;//y^2 = y2

             return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}

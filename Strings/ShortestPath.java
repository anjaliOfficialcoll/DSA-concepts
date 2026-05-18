package Strings;

public class ShortestPath {

    public static double shortestPath(String s){
        int x=0;int y=0;
        for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(d=='N'){
                y++;
            }
            else if(d=='S'){
                y--;
            }
            else if(d=='w'){
                x--;
            }else{
                x++;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String s="NS";
        System.out.print(shortestPath(s));
    }
    
}

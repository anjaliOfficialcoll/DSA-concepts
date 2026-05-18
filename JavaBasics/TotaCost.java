package JavaBasics;
import java.util.*;
public class TotaCost {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        System.out.println((pen+pencil+eraser)*0.18+(pen+pencil+eraser));
        sc.close();

    }
    
}

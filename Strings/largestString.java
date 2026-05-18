// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Strings;

import java.util.*;

public class largestString{
    public static String largestString(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }

        return largest;
    }
   

   

   public static void main(String[] var0) {
      String fruits[]={"apple","banana","mango","raspberry"};
         System.out.println(largestString(fruits));
   }
}

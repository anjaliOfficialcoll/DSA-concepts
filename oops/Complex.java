package oops;
 class OpComplex {

    public void Sum(int num,int img){
        System.out.println(num+img);

    }

    public void Difference(int num,int img){
        System.out.println(num-img);

    }
    public void Product(int num,int img){
        System.out.println(num*img);

    }
    
}

public class Complex{
    public static void main(String args[]){
        OpComplex complex=new OpComplex();
        complex.Sum(5,2);
        complex.Difference(5,2);
        complex.Product(5,2);

    }
}
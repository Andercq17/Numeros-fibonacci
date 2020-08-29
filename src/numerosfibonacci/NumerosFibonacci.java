
package numerosfibonacci;


public class NumerosFibonacci {

    
    public static void main(String[] args) {
    long x=1;
    long n;
    long y=0;
    long t=0;
     System.out.println(y);
     System.out.println(x);
     
    do{
        n=x+y;
        y=x;
        x=n;
        System.out.println(n);
        t++; //t= cantidaad de numeros que quiero que imprima
        }while(t<=50);
    }
    
}

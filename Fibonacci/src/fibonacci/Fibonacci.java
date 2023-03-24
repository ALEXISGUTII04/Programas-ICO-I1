
package fibonacci;

public class Fibonacci {
      
    public static void main (String [] args){
        
        int numerof = 12;
        for (int i = 0; i<numerof; i++){
            System.out.print (fibonacci(i)+ " ");
        }
    }
    public static int fibonacci (int n){
        if (n == 0|| n == 1){
            return n;
        } else{
            return fibonacci (n-1) + fibonacci (n-2);
        }
    }
}

    
    


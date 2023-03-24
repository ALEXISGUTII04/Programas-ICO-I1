
package potencia;

public class Potencia {

    public static void main(String[] args) {   
        
        int base = 5;
        int exponente = 4;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
    }

    public static int potencia(int base, int exponente) {
        
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}

    
    


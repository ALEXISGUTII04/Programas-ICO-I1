
package potencia;

public class Potencia {

    public static void main(String[] args) {   
        
        int numero = 5;
        int exponente = 4;
        int resultado = potencia(numero, exponente);
        System.out.println(numero + " elevado a la " + exponente + " es igual a: " + resultado);
    }

    public static int potencia(int numero, int exponente) {
        
        if (exponente == 0) {
            return 1;
        } else {
            return numero * potencia(numero, exponente - 1);
        }
    }
}

    
    


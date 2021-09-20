package co.edu.ucundinamarca.taller3;

/**
 *
 * @author sergio
 */
public class MainPruebaFunciones {
    
    public static void main(String[] args) {
        
        int numero = 5;
        int numero1 = 100;
        System.out.println(Funciones.factorial(numero));
        System.out.println(Funciones.potencia(numero, numero1));
        System.out.printf(" %.0f", Funciones.factorialRec(numero1));   
        
        
        
        
        
    }
    
}

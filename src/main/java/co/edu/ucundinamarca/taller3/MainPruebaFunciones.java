package co.edu.ucundinamarca.taller3;
import org.apache.log4j.Logger;


/**
 *
 * @author sergio
 */
public class MainPruebaFunciones {

    static Logger log = Logger.getLogger(MainPruebaFunciones.class.getName());
    
    public static void main(String[] args) {
        
        int numero = 5;
        int numero1 = 100;
        
        log.info(Funciones.factorial(numero));
        log.info(Funciones.potencia(numero, numero1));
        System.out.printf(" %.0f", Funciones.factorialRec(numero)); 
        
        
        
        
        }
    
}
        
    

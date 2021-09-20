
package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;
import static co.edu.ucundinamarca.taller3.MainPruebaFunciones.log;
/**
 *
 * @author sergio
 */
public class Mainsucesion {
 
   static Logger LOG = Logger.getLogger(Mainsucesion.class.getName()); 
    
    
     public static void main(String[] args) {
        int numero2 = 10;
        log.info(Sucesion.s(numero2));
        
     }
    
}

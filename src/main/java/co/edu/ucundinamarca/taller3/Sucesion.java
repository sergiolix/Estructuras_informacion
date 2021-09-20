
package co.edu.ucundinamarca.taller3;

/**
 *
 * @author sergio
 */
public class Sucesion {

    
    
    public static double s (int n){
        
     if (n == 0){
        return 1;
    
    }else if (n == 1){
      return 2;
        
    }else if (n <=0){
      return n;  
        
    }else
        return  (0.91 * s(n-1) + 0.1 * s(n-2)) ;
    
    }
 
      
}


package co.edu.ucundinamarca.taller3;


import org.apache.log4j.Logger;
/**
 *
 * @author sergio
 */
public class Funciones {

    private static final Logger LOG = Logger.getLogger(Funciones.class.getName());
    


public static int factorial(int numero){
    int auxiliar = 1;
    for (int i=2;i<=numero; i++){
     auxiliar*=i;
    }
    
    return auxiliar;
}
public static double factorialRec(int numero){
if (numero == 0) {
            return 1;
      } else {
    
            return (numero * factorialRec(numero - 1));
      }

  


}

public static int potencia(int base, int exponente){
    if(exponente == 1){
        return base;
    }else if(exponente == 0){
         return 1;  
    }else{
      return base * potencia(base,exponente-1);
  
  }

    


}

   
}

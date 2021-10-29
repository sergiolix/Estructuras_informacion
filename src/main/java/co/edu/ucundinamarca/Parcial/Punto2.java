
package co.edu.ucundinamarca.Parcial;

import java.util.Arrays;



/**
 *
 * @author Sergio
 */
public class Punto2 {
 
public static void main(String []args){
    
    int[]ar={1,1,2,3,4,5,6,6,6,7,8,8,1};
    Arrays.sort(ar);
    int contador=0;
    int aux=ar[0];
    
   for(int i =0;i<ar.length;i++){
     if (aux==ar[i]){
         contador++;
      }
      else
     {
         System.out.println("el numero "+ aux+ "se repite"+contador+ " veces");
         contador=1;
         aux=ar[i];
     }
     
}
}
}

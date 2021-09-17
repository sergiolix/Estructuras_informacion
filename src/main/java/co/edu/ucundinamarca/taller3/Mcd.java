
package co.edu.ucundinamarca.taller3;

/**
 *
 * @author sergio
 */
public class Mcd {
   
    
    public static int mcd(int a, int b){
    
    return mcd(b, a%b);
    }

     public static void main(String args[]) {
      
         int a= 96, b=36;
         System.out.println(mcd(a,b));



     }
}

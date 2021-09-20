
package co.edu.ucundinamarca.taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class Mcd {
   
    
    public static int mcd(int a, int b){
        JOptionPane.showMessageDialog(null, "inicio de mcd(96, 36)");
        if(b==0){
           JOptionPane.showMessageDialog(null, "FIN de mcd(96, 36)");
           return a;
        }else
           
           return mcd(b, a % b);
        
    }

     public static void main(String args[]) {
      
         int a= 96, b=36;
         System.out.println("mcd("+a+", "+b+")="+ mcd(a,b));



     }
}

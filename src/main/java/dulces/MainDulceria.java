
package dulces;

import dulces.Dulceria;
import javax.swing.JOptionPane;
import java.util.*;
import org.apache.log4j.Logger;

public class MainDulceria {
    
      static Logger log = Logger.getLogger(MainDulceria.class.getName());  
      public static void main (String[] args){
      Scanner a = new Scanner(System.in);
      
      Dulceria dulce = new Dulceria();
      int opcion = 0;
      String dul = "";
      boolean eliminado = false;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1. Agregar un dulce  \n"
                        + "2. Eliminar un dulce  \n"
                        + "3. Mostrar todos los dulces que hay  \n"
                        + "4. Exit"
                        , JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    
                    case 1:
                        dul = (JOptionPane.showInputDialog(null," Ingrese el dulce a agregar ", " Agregando dulce  ", JOptionPane.INFORMATION_MESSAGE));
                        dulce.insetar(dul);
                        break;
                        
                    case 2:
                        if(!dulce.estaVacia()){
                        dul = (JOptionPane.showInputDialog(null," Ingrese el nombre del dulce a eliminar", " Eliminando  dulce ", JOptionPane.INFORMATION_MESSAGE));
                        eliminado = dulce.eliminar(dul);
                        if(eliminado){
                          JOptionPane.showMessageDialog(null, "el dulce eliminado es: " + dul , "eliminando dulce" , JOptionPane.INFORMATION_MESSAGE);  
                        }else{
                           JOptionPane.showMessageDialog(null, "el dulce "+ dul +" no esta en la Dulceria", "elemento no encontrado" , JOptionPane.INFORMATION_MESSAGE);    
                        }}else{
                          JOptionPane.showMessageDialog(null, "aun no hay dulces en la dulceria", "lista vacia", JOptionPane.INFORMATION_MESSAGE);  
                        }
                        break;
                    case 3:
                        if(!dulce.estaVacia()){
                            dulce.Mostrarlista();
                        }else{
                            JOptionPane.showMessageDialog(null, "aun no hay dulces", "lista vacia", JOptionPane.INFORMATION_MESSAGE);                            
                        }
                        break;
                    case 4: 
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Terminado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "La Opcion No Esta En El Menu", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        
                }
                    
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }
        }while(opcion != 4);

    }
}
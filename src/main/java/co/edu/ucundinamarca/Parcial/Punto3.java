
package co.edu.ucundinamarca.Parcial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import jdk.jpackage.internal.Log;

/**
 *
 * @author Sergio
 */
public class Punto3 {
     public Punto3() {
    }
    
    ArrayList<String> Jugadores = new ArrayList<String>();

    public void Agregar(String x) {
        
        Jugadores.add(x);

    }

    public void mostrar() {
        System.out.println(Jugadores);
    }
    
    public void solucion(){
        int M = Integer.parseInt(JOptionPane.showInputDialog("numero "));
        int N = Jugadores.size();
        System.out.println(N);
        M = M - 1;
 
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<= N ; i ++){
            list.add(i);
        }
 
        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while(list.size() > 1){
            if (!iterator.hasNext()){
                iterator = list.iterator();
            }
 
            int temp = -1;
            while(iterator.hasNext() && count <= M){
                temp = iterator.next();
                count ++;
            }
 
            if (count > M){
                count = 0;
                 iterator.remove();
                 System.out.println("remove : " + Jugadores.get(temp- 1));
            }
        }
 
        // the last person
        System.out.println("winner is : " + Jugadores.get(list.get(0)-1));
    }
         
    
    
    }


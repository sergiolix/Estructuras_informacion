
package co.edu.ucundinamarca.taller2;

import static co.edu.ucundinamarca.taller2.MainPersona.log;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Semana {

    public Semana() {
    }
    ArrayList<String> Semanas = new ArrayList<String>();
    
    
    
    public void CargarDias(){
    Semanas.add("lunes");
    Semanas.add("martes");
    Semanas.add("miercoles");
    Semanas.add("jueves");
    Semanas.add("viernes");
    Semanas.add("Sabado");
    Semanas.add("Domingo");
    }
    
    public void CuantosDias(){
        
        log.info("El numero de dias son"+ Semanas.size());
        
    }
    
    public void ObtenerDia(){
        
        int key =Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de dia 0 a 6:"));
        log.info(Semanas.get(key));
    }
    
    public void mostrarDias(){
       log.info(Semanas);
    }



}

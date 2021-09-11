package co.edu.ucundinamarca.taller2;
import static co.edu.ucundinamarca.taller2.MainPersona.log;
import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;
import static jdk.internal.org.jline.keymap.KeyMap.key;

public class Colegio {
    HashMap<String, String> lista = new HashMap<String, String>();
    private static final Logger LOG = Logger.getLogger(Colegio.class.getName());

    public Colegio() {
    }

    public void AgregarAlumno(){
    
      String key = JOptionPane.showInputDialog("ingrese una llave:");
      String Nacionalidad = JOptionPane.showInputDialog("ingrese una Nacionalidad:");
      lista.put(key,Nacionalidad);
     }
    public void MostrarTodosAlumno(){
     log.info(lista);
    }
    public void cuantosAlumnos(){
     log.info(lista.size());
    
    }
    public void borrarAlumnos(){
     String key = JOptionPane.showInputDialog("ingrese La  llave de la nacionalidad a borrar:");
     lista.remove(key);
    }
}

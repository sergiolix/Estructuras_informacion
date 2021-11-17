
package co.edu.ucundinamarca.taller8;

import java.util.logging.Logger;
/**
 *
 * @author Sergio
 */
public class Nodo {
    String info;
    int nohijos;
    Nodo hijos[];
    Nodo hijosT[];
    
    private static final Logger LOG = Logger.getLogger(Nodo.class.getName());
    public Nodo(String dato){
        info=dato;
        this.nohijos=0;
    }
    public void cHijos(){
        hijosT=new Nodo[nohijos+1];
        for(int i=0;i<this.nohijos;i++)
        {
            hijosT[i]=hijos[i];
        }
    }
    public void aumentarhijo(Nodo nodo){
     cHijos();
     hijosT[this.nohijos]=nodo;
     hijos = hijosT;
     this.nohijos++;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String dato) {
        info = dato;
    }
    public void verNodo(){
     LOG.info("{"+info+"}");
        
    }
    public void InOrden(Nodo nodo){
         if(nodo.nohijos == 0){
             LOG.info("" + nodo.getInfo());
         }else if(nodo.nohijos > 0){
            InOrden(nodo.hijos[0]);
             LOG.info(" " + nodo.getInfo());
             for(int w = 0; w < nodo.nohijos; w = w + 1){
                 InOrden(nodo.hijos[w]);
             }
         }
     }
    public void niveles(Nodo nodo){
     LOG.info("A B C D E F G");
    
    }
}

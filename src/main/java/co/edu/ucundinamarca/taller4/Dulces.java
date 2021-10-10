
package co.edu.ucundinamarca.taller4;


import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;


/**
 *
 * @author sergio
 */
public class Dulces {

    static  Logger log = Logger.getLogger(Dulces.class.getName());
   
    static ArrayList<String> ListaDulces = new ArrayList<String>();
     
       
   
     
   
       
      
    
   
     static void imprimirSinIterando(ArrayList<String> ListaDulces){
       ListaDulces.add("Chocoramo");
       ListaDulces.add("Gansito");
       ListaDulces.add("bombombun");
       ListaDulces.add("mentas");
       ListaDulces.add("chocolate");
       ListaDulces.add("oreo");
       ListaDulces.add("festival");
       ListaDulces.add("helado");
       ListaDulces.add("gomitas");
       ListaDulces.add("arequipe");
       for(int i=0; i <ListaDulces.size();i++){
       log.info(ListaDulces.get(i));
       }
    }
     public static void imprimirIterando (ArrayList<String> ListaDulces){
       ListaDulces.add("Chocoramo");
       ListaDulces.add("Gansito");
       ListaDulces.add("bombombun");
       ListaDulces.add("mentas");
       ListaDulces.add("chocolate");
       ListaDulces.add("oreo");
       ListaDulces.add("festival");
       ListaDulces.add("helado");
       ListaDulces.add("gomitas");
       ListaDulces.add("arequipe");
       
       Iterator < String > it = ListaDulces.iterator();
            while (it.hasNext()) {
                log.info(it.next() + " ");
            } 
     }
 }

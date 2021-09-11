
package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Logger;


public class MainAnimal {
    
    static Logger log = Logger.getLogger(MainPersona.class.getName());
    
public static void main(String[] args) {
    
        Animal animalUno = new Animal("Hanner", 4, "conejo",2,1234);
        Animal animalDos = new Animal("Julian", 2, "paloma",2,12345);
        Animal animalTres = new Animal("Hanner", 4, "conejo",2,1234);
 
        
        if (animalUno.equals(animalDos)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
        if (animalUno.equals(animalTres)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
    }
    
    
}

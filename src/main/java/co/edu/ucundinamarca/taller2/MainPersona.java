
package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Logger;


public class MainPersona {

    static Logger log = Logger.getLogger(MainPersona.class.getName());

    public static void main(String[] args) {
        
        
        
        Persona personaUno = new Persona("Hanner", 10, 20,132);
        Persona personaDos = new Persona("Julian", 10, 20,132);
        Persona personaTres = new Persona("Hanner", 10, 20,132);
        if (personaUno.equals(personaDos)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
        if (personaUno.equals(personaTres)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
    }

}

package gt.edu.url.examen1.impl;
import java.util.Scanner; 


/**
 *Clase principal donde se ejecuta todas las clases
 * @author Jose Herrera 
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Examen 1");
        
        ChudnovskyImpl algoritmo = new ChudnovskyImpl();
        System.out.println(algoritmo.calcularPi(2));
        /**
         * Se fabrica la nueva Fabrica y se crean las instancias de los 10 nuevos monstruos
         */
        FabricaRangerImpl fabricaNueva = new FabricaRangerImpl();
        Monstruo M1 = new Monstruo();
        Monstruo M2 = new Monstruo();
        Monstruo M3 = new Monstruo();
        Monstruo M4 = new Monstruo();
        Monstruo M5 = new Monstruo();
        Monstruo M6 = new Monstruo();
        Monstruo M7 = new Monstruo();
        Monstruo M8 = new Monstruo();
        Monstruo M9 = new Monstruo();
        Monstruo M10 = new Monstruo(); 
        
        /**
         * Se crean los monstrous a partir del método fabricar de FabricaRangerImpl.java
         */
        M1 = fabricaNueva.fabricar("agua");
        
        M2 = fabricaNueva.fabricar("aire");
        
        M1 = fabricaNueva.fabricar("tierra");
        
        M2 = fabricaNueva.fabricar("fuego");
        
        M1 = fabricaNueva.fabricar("fuego");
        
        M2 = fabricaNueva.fabricar("aire");
        
        M1 = fabricaNueva.fabricar("tierra");
        
        M2 = fabricaNueva.fabricar("aire");
        
        M1 = fabricaNueva.fabricar("tierra");
        
        M2 = fabricaNueva.fabricar("agua");
        
        
        /**
         * se apilan los
         */
        
        
        
    }
    
    
}

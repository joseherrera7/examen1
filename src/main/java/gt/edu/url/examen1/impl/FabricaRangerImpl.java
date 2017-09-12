/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.FabricaRanger;


/**
 *Clase que implementa la fabrica Ranger
 * @author Jose Herrera
 */
public class FabricaRangerImpl implements FabricaRanger {
    private Monstruo[] _core = new Monstruo[10]; 
    private int _count = 0; 
/**
 * Método que hace algo; el monstruo.
 */
    @Override
    public void hacerAlgo() {
        System.out.println("Soy un monstruo y estoy haciendo algo");
    }
/**
 * Funcion que devuelve si se apiló el monstruo 
 * @param monstruo monstruo que se apila en el arreglo
 * @return retorna true 
 */
    @Override
    public boolean apilar(Monstruo monstruo) {
         _core[_count] = monstruo;
            _count++;
            return true;
    }
/**
 * Funcion que devuelve si se Desapila el monstruo
 * @param monstruo monstruo que se desapila del arreglo
 * @return retorna true
 */
    @Override
    public boolean desapilar(Monstruo monstruo) {
        
                    _core[_count] = null;
                    _count--;
                    return true;
    }
/**
 * Funcion que devuelve si se encoló el monstruo 
 * @param monstruo monstruo que se encola en el arreglo
 * @return retorna true
 */
    @Override
    public boolean encolar(Monstruo monstruo) {
        _core[_count] = monstruo;
            _count++;
            return true;
    }
/**
 * Funcion que devuelve si se desencoló el monstruo. 
 * @param monstruo monstruo que se desencola del arreglo
 * @return retorna true
 */
    @Override
    public boolean desencolar(Monstruo monstruo) {
        _core[0] = null;
            _count--;
            for (int i = 0; i < _count+1; i++) {
            _core[i] = _core[i+1];
        }
            return true;
    }
/**
 * Funcion de tipo Monstruo que devuelve el valor del monstruo creado
 * @param elemento elemento que se desea crear el monstruo
 * @return Monstruo creado
 */
    @Override
    public Monstruo fabricar(String elemento) {
        if (elemento == "Fuego" || elemento == "fuego") {
            Monstruo nuevoMonstruo = new MonstruoFuego();
            nuevoMonstruo.setElementoPrimario(elemento);
            return nuevoMonstruo;
        }
        else if (elemento == "Aire" || elemento == "aire") {
            Monstruo nuevoMonstruo = new MonstruoAire();
            nuevoMonstruo.setElementoPrimario(elemento);
            return nuevoMonstruo;
        }
        else if (elemento == "Tierra" || elemento == "tierra") {
            Monstruo nuevoMonstruo = new Monstruo();
            nuevoMonstruo.setElementoPrimario(elemento);
            return nuevoMonstruo;
        }
        else if (elemento == "Agua" || elemento == "agua") {
            Monstruo nuevoMonstruo = new Monstruo();
            nuevoMonstruo.setElementoPrimario(elemento);
            return nuevoMonstruo;
        }
        return null;
        
    }
    /**
     * Imprime el arreglo
     */
    public void print(){
            System.out.println(_core.toString());
        }
    
}

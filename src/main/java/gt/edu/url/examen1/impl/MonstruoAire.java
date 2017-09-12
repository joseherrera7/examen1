/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *Monstruo Hijo
 * @author Jose Herrera
 */
public class MonstruoAire extends Monstruo{
    /**
     *Funcion que retorna un texto
     * @return retorna el texto
     */
    public String volar(){
        return "Soy " + getNombre() + " y estoy volando";
    }
}

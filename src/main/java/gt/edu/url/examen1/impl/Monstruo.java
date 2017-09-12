/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *Clase donde están los atributos de los monstrous y sus habilidades
 * @author Jose Herrera
 */
public class Monstruo {
    /**
     * Atributos de los monstruos
     */
    private String nombre;
    private String elementoPrimario;
    private int edad;
    private String Color;
/**
 * Getters y setters de los atributos
 * @return 
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElementoPrimario() {
        return elementoPrimario;
    }

    public void setElementoPrimario(String elementoPrimario) {
        this.elementoPrimario = elementoPrimario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    /**
     * Funcion que devuelve un texto
     * @return devuelve un texto
     */
    public String agigantarse(){
        return "Soy un monstruo y me agiganto";
    }
    /**
     * Funcion que devuelve un texto
     * @return devuelve un texto
     */
    public String caminarLento(){
        return "Soy un monstruo y camino lento";
    }
    /**
     * Funcion que devuelve un texto
     * @return devuelve un texto
     */
    public String golpear(){
        return  "Soy un monstruo y estoy golpeando";
    }
}

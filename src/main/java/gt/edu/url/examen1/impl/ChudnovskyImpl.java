/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.Chudnovsky;
/**
 *Clase de implementacion de Chudnovsky
 * @author Jose Herrera
 */
public class ChudnovskyImpl implements Chudnovsky{
/**
 * Funcion que se usa para calcular el algoritmo de chudnovsky
 * @param cantidadDigitos ingreso de cantidad  de dígitos de PI 
 * @return Calcula PI
 */
    @Override
    public double calcularPi(int cantidadDigitos) {
        double PI;
        double num;
        double den;
        double gigaNum = -2.62537412640768000 *  Math.pow(10,17);
        if (cantidadDigitos == 0) {
            return 13591409;
        }
        else{
        num = ((calcularFactorial(6*cantidadDigitos))) * ((545140134*cantidadDigitos)+13591409);
        den = calcularFactorial(3*cantidadDigitos) * Math.pow(calcularFactorial(cantidadDigitos),3) * Math.pow(gigaNum, cantidadDigitos);
        PI = num / den;
        return PI + calcularPi(cantidadDigitos-1);
        }
    }
/**
 * Funcion para calcular número factorial
 * @return Factorial de un número
 */
    public double calcularFactorial(int numero) {
        if (numero == 0) 
            return 1;
        else 
            return numero * calcularFactorial(numero-1);}
    
    
}

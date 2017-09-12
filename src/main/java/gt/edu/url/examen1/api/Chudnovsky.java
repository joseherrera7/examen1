package gt.edu.url.examen1.api;

/**
 *Interface donde se encuentra la funcion calcular pi
 * @author Jose Herrera
 */
public interface Chudnovsky {
    /**
     * Funcion que retorna el calculo de Pi
     * @param cantidadDigitos Muestra la cantidad de iteriaciones que se repetira el algoritmo, y como 1 = 14 decimales de pi
     * @return Retorna calculo de Pi
     */
    public double calcularPi(int cantidadDigitos);
    
}

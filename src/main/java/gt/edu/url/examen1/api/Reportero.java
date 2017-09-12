package gt.edu.url.examen1.api;

/**
 *Interface 
 * @author Jose Herrera
 */
public interface Reportero {
    /**
     * Funcion que calcula el ganador del set
     * @param a puntos del jugador a del set
     * @param b puntos del jugador b del set
     * @return el ganador del set
     */
    	public String calcularGanador(int a, int b);
        /**
         * Calcula el campeon de la temporada en base de sus victorias
         * @return retorna el campeon de la temporada
         */
	public String calcularCampeon();
        /**
         * Funcion que retorna el identificador del campeon
         * @param juego
         * @return retorna ID del campeon
         */
	public String recordarGanador(int juego);
}

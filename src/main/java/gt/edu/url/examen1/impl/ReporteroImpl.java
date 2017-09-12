/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.Reportero;
/**
 *Clase que implementa la interfaz de Reportero
 * @author JoseCarlos
 */
public class ReporteroImpl implements Reportero {
/**
 * Creacion de array para guardar partidos
 */
    private String[] _coreList  = new String[9];
    private int _count = 0;
    /**
     * Funcion que calcula el ganador del set
     * @param a puntos del jugador a del set
     * @param b puntos del jugador b del set
     * @return el ganador del set
     */
    @Override
    public String calcularGanador(int a, int b) {
      String result = "";
        if ( a <= 7 && b <= 7) {
            if (a == 7 || b == 7) {
                if (a == b+2 || a == b+1) {
                    result = "Ganador A";
                }
                else if (b == a+2 || b == a+1) {
                    result = "Ganador B";
                }
                else{
                    result = "Juego no valido";
                }
            }
            else if (b == 6 || a == 6) {
                if (a>=b+2) {
                    result = "Ganador A";
                }
                else if (b>=a+2) {
                    result = "Ganador B";
                }
                else{
                    result = "Sigue el juego";
                }
            }
            else{
                result = "Sigue el juego";
            }
          }
        else {
            result = "Juego no valido";
        }
        
        _coreList[_count] = result;
          _count ++;
        return result;
      
    }
/**
         * Calcula el campeon de la temporada en base de sus victorias
         * @return retorna el campeon de la temporada
         */
    @Override
    public String calcularCampeon() {
        int a = 0;
        int b = 0;
        for (int i = 0; i < _coreList.length; i++) {
            if (_coreList[i] == "Ganador A") {
                a++;
            }
            else if (_coreList[i] == "Ganador B") {
                b++;
            }
            
        }
        if (a>b) {
            return "Campeon es A";
        }
        else if (b>a) {
            return "Campeon es B";
        }
        return "No hay campeon";
    }
/**
         * Funcion que retorna el identificador del campeon
         * @param juego
         * @return retorna ID del campeon
         */
    @Override
    public String recordarGanador(int juego) {
        return _coreList[juego-1];
    }
    
}

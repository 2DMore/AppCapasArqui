/*

 */
package Capa1;

import Capa2.ModTexto;
import java.util.ArrayList;

/**
 *
 * @author picar
 */
public class VariacionesFrases implements CapaCrearIndice{
    ArrayList<String> devolver;

    @Override
    public ArrayList<String> crarIndice(String textInput) {
        devolver = new ArrayList();
        ModTexto normalizador = new ModTexto();
        textInput = normalizador.NormalizarCadena(textInput);
        devolver.add(textInput);
        
        String fraseActual= rotarString(textInput,' ');
        while(!ChecarFraseRepetida(fraseActual)){
            devolver.add(fraseActual);
            fraseActual = rotarString(fraseActual,' ');
        }
        return devolver;
    }
    
    private static String rotarString(String palabra, char separador){
        String[] separar = palabra.split(String.valueOf(separador));
        String[] devolver = separar.clone();
        devolver[0] = separar[separar.length-1];

        for(int i=0; i< separar.length-1; i++){
            devolver[i+1] = separar[i];
        }
        return ModTexto.arrayToString(devolver);

    }
    
    private boolean ChecarFraseRepetida(String rotacion){
        String p= devolver.get(0);
        return p.equals(rotacion);  
    }
    
    
     
    
}

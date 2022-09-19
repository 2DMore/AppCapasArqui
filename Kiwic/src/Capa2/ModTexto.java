/*

 */
package Capa2;

import Capa3.ArrayUtils;

/**
 *
 * @author picar
 */
public class ModTexto implements CapaDeModTexto{
    

    @Override
    public String NormalizarCadena(String textInput) {
        textInput = textInput.toLowerCase();
        textInput = quitarEspacios(textInput);
        textInput = quitarPalabrasVacias(textInput);
        return textInput;
    }
    
     private static String quitarEspacios(String cadena){
        String retornar = cadena.trim().replaceAll("\\s{2,}", " ");
        return retornar;
    }
    
    public static String arrayToString(String[] arreglo){
        String devolver =arreglo[0];
        for(int i=1;i< arreglo.length; i++){
            devolver+=" "+arreglo[i];
        } 
        return devolver;
    }
    
    private static String quitarPalabrasVacias(String cadena){
        ArrayUtils utilidad = new ArrayUtils();
        String[] palabrasVacias = utilidad.leerArchivo("src/palabrasVacias.txt");
        
        String[] separado = cadena.split(" ");
        
        for(int i= 0; i< separado.length;i++){
            if(utilidad.buscar(palabrasVacias, separado[i])){
                separado[i]="";
            }
        }
        
        String retornar = arrayToString(separado);
        retornar = quitarEspacios(retornar);
        return retornar;  
    }
    
}

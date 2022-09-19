/*

 */
package kiwic;

import Capa1.VariacionesFrases;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author picar
 */
public class Kiwic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a= args[0];
        System.out.println("------------------");
        VariacionesFrases kiwicParser = new VariacionesFrases();
        ArrayList<String> Frases = kiwicParser.crarIndice(a);
        Collections.sort(Frases);
        for(String s: Frases){
            System.out.println(s);
        }
        System.out.println("------------------");

    }

//    public static String[] rotarArreglo(String[] separar){
//        String[] devolver = separar.clone();
//        devolver[0] = separar[separar.length-1];
//
//        for(int i=0; i< separar.length-1; i++){
//            devolver[i+1] = separar[i];
//        }
//        return devolver;
//    }
//
//    public static String rotarString(String palabra, char separador){
//        String[] separar = palabra.split(String.valueOf(separador));
//        String[] devolver = separar.clone();
//        devolver[0] = separar[separar.length-1];
//
//        for(int i=0; i< separar.length-1; i++){
//            devolver[i+1] = separar[i];
//        }
//        return arrayToString(devolver);
//
//    }
//
//    public static String arrayToString(String[] arreglo){
//        String devolver =arreglo[0];
//        for(int i=1;i< arreglo.length; i++){
//            devolver+=" "+arreglo[i];
//        } 
//        return devolver;
//
//    }
    
}

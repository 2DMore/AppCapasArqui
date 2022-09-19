/*

 */
package Capa3;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author picar
 */
public class ArrayUtils implements CapaDeDatos{
    

    @Override
    public boolean buscar(String[] arreglo, String palabra) {
        if(busquedaBinaria(arreglo, palabra)<0){
            return false;
        }
        return true;
    }
    @Override
    public String[] leerArchivo(String ruta) {
        String[] retornar =null;
        try {
            retornar= LectorArchivo.obtenerContenido(ruta);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo: " +ruta+ "\nNo encontrado");
            System.exit(0);
        }
        return retornar;
    }
    
    private static int busquedaBinaria(String[] arreglo, String buscar){
        return Arrays.binarySearch(arreglo, buscar);
    }
    
}

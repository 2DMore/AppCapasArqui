/*

 */
package Capa3;

/**
 *
 * @author picar
 */
public interface CapaDeDatos {
    public abstract boolean buscar(String[] arreglo, String palabra);
    public String[] leerArchivo(String ruta);
    
}

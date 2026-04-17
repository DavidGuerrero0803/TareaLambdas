import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class EjerciciosStaticLambdas {

    //=======================================================================
    //                          MÉTODOS ESTÁTICOS
    //=======================================================================

    /**
     * multiplicadorArrayList() estático pide un ArrayList de números y un factor de multiplicación,
     * el resultado de las multiplicaciones se mostrarán en pantalla.
     * @param numeros (el ArrayList con los números).
     * @param multiplicador (el factor por el que los vas a multiplicar).
     */
    public static void multiplicadorArrayList(ArrayList<Integer> numeros, int multiplicador) {
        numeros.replaceAll(n -> n * 3);
        System.out.println("=== MULTIPLICADOR ===");
        System.out.println(numeros);
    }

    /**
     * filtradorSelectivo() pide una ArrayList de cadenas, un caracter para eliminar palabras
     * y una cantidad con la cual eliminar una cadena de n longitud.
     * @param cadena (el ArrayList que contiene cadenas de textos).
     * @param letra (el caracter con el cual borrar palabras que empiecen con él).
     * @param n (longitud de las palabras que se desean eliminar).
     */
    public static void filtradorSelectivo(ArrayList<String> cadena, char letra, int n) {
        cadena.removeIf(c -> c.startsWith(String.valueOf(letra)) || c.length() < n);
        System.out.println("=== FILTRO SELECTIVO ===");
        System.out.println(cadena);
    }

    /**
     * conversorDeMayusculas() se encarga de tomar un ArrayList de cadenas,
     * para convertirlas todas en mayúscula y después regresar el resultado en un nuevo arreglo.
     * @param cadena2 (el ArrayList que contiene cadenas de textos).
     * @return ArrayList con las cadenas de texto convertidas a mayúscula.
     */
    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> cadena2) {
       return cadena2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /**
     * obtenerCuadradosUnicos() se encarga de filtrar números pares que haya
     * en un ArrayList con números, los eleva al cuadrado y los almacena en un HashSet.
     * @param numeros2 (el ArrayList que contiene enteros duplicados).
     * @return HashSet sin los duplicados y los pares multiplicados.
     */
    public static HashSet<Integer> obtenerCuadradosUnicos(ArrayList<Integer> numeros2) {
        return numeros2.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }

    /**
     * generarMapaLongitudes() transforma una ArrayList de palabras en un mapa, en donde...
     * Clave: La palabra misma. Valor: El número de caracteres (longitud).
     * @param palabras (el ArrayList tipo String de palabras).
     * @return HashMap con el resultado de las generaciones del mapa con longitudes.
     */
    public static HashMap<String, Integer> generarMapaLongitudes(ArrayList<String> palabras) {
        return palabras.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        String::length,
                        (valorExistente, nuevoValor) -> valorExistente,
                        HashMap::new
                ));
    }
}

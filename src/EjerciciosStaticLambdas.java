import java.util.ArrayList;

public class EjerciciosStaticLambdas {

    //=======================================================================
    //                          MÉTODOS ESTÁTICOS
    //=======================================================================

    /**
     * Este metodo estático pide un ArrayList de números y un factor de multiplicación,
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
     * Este metodo estático pide una ArrayList de cadenas, un caracter para eliminar palabras
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
}

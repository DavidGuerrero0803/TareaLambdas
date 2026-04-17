import java.util.*;
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

    /**
     * modificadorInventario() recorre un inventario, aplicando un 10%
     * de descuento en el precio de los productos.
     * @param inventario (HashMap que contiene como clave: producto y valor: precio)
     */
    public static void modificadorInventario(HashMap<String, Double> inventario) {
        inventario.forEach((producto, precio) -> {
            double descuentoAplicado = precio * 0.1;
            double precioConDescuento = precio - descuentoAplicado;
            System.out.printf("Producto: %s, Precio: %.2f, Precio con descuento: %.2f%n",
                    producto, precio, precioConDescuento);
        });
    }

    /**
     * contadorFrecuencias() crea un mapa de frecuencias de palabras, de manera que:
     * Si la palabra NO existe, se pone un 1.
     * Si la palabra existe, se suma 1 al valor actual.
     * @param palabras2 (ArrayList con palabras).
     * @return (HashMap en donde la clave es la palabra y el valor su frecuencia).
     */
    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras2) {
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
        for (String palabra : palabras2) {
            mapaFrecuencias.merge(palabra, 1, (valorActual, nuevoValor) ->
                    valorActual + nuevoValor);
        }
        return mapaFrecuencias;
    }

    /**
     * clasificadorPalabras() filtra las palabras cuya frecuencia sea mayor o igual al valor dado.
     * @param mapaFrecuencias (HashMap que contiene con clave la palabra y la llave su "frecuencia").
     * @param frecuencia (parámetro que filtrará las palabras que sobrepasen esa "frecuencia").
     * @return solo los nombres de las palabras en un ArrayList.
     */
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> mapaFrecuencias, int frecuencia) {
        return mapaFrecuencias.entrySet()
                .stream()
                .filter(m -> m.getValue() >= frecuencia)
                .map(m -> m.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * deduplicacionPalabras() procesa una frase entera para extraer palabras únicas
     * que cumplan con una longitud mínima, pasando toda la cadena a minúsculas.
     * @param frase (cadena de texto).
     * @param longitud (la longitud mínima que debe tener la palabra para no descartarla).
     * @return HashSet con todas las palabras sin duplicar y que hayan cumplido la longitud.
     */
    public static HashSet<String> deduplicacionPalabras(String frase, int longitud) {
        String[] palabras = frase.split(" ");

        return Arrays.stream(palabras)
                .filter(p -> p.length() >= longitud)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}

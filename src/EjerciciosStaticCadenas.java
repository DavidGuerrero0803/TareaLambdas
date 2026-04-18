import java.util.*;
import java.util.stream.Collectors;

public class EjerciciosStaticCadenas {
    /**
     * filtroSelectivo() pide una ArrayList de cadenas, un caracter para eliminar palabras
     * y una cantidad con la cual eliminar una cadena de n longitud.
     * @param cadena (el ArrayList que contiene cadenas de textos).
     * @param letra (el caracter con el cual borrar palabras que empiecen con él).
     * @param n (longitud de las palabras que se desean eliminar).
     */
    public static void filtroSelectivo(ArrayList<String> cadena, char letra, int n) {
        // La lambda actúa como condición, es decir, si devuelve true, el elemento se eliminará.
        cadena.removeIf(c -> c.startsWith(String.valueOf(letra)) || c.length() < n);

        System.out.println("Sabores que no empiezan con " + letra + " y no tienen longitud <" +n + ": "+ cadena);
    }

    /**
     * conversorMayusculas() se encarga de tomar un ArrayList de cadenas,
     * para convertirlas todas en mayúscula y después regresar el resultado en un nuevo arreglo.
     * @param cadena2 (el ArrayList que contiene cadenas de textos).
     * @return ArrayList con las cadenas de texto convertidas a mayúscula.
     */
    public static ArrayList<String> conversorMayusculas(ArrayList<String> cadena2) {
        // Como se pide que regrese el ArrayList, se usa return en este caso,
        // abriendo de paso el flujo.
        return cadena2.stream()
                // Con map hace que cada String pase a su versión en mayúsculas.
                // En caso de haber un null, no se intentará convertir y se evitará posibles errores.
                // Para esto, se utilizó un operador ternario.
                .map(s -> (s == null) ? null : s.toUpperCase())
                // El resultado de esta transformación se almacena en un nuevo ArrayList.
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /**
     * mapaLongitudes() transforma una ArrayList de palabras en un mapa, en donde...
     * Clave: La palabra misma. Valor: El número de caracteres (longitud).
     * @param palabras (el ArrayList tipo String de palabras).
     * @return HashMap con el resultado de las generaciones del mapa con longitudes.
     */
    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras) {
        return palabras.stream()
                // Dentro del toMap, se reciben dos lambdas.
                .collect(Collectors.toMap(
                        // La primer lambda se encarga de definir a la clave.
                        p -> p,
                        // La segunda lambda se encarga de definir el valor.
                        p -> p.length(),
                        // Se añade un tercer argumento para evitar problemas con duplicados.
                        // Si hay dos o más palabras iguales, se toma el valor de la primera
                        // y el resto se quedarán con ese valor que ya existe.
                        (valorExistente, nuevoValor) -> valorExistente,
                        HashMap::new
                        // Los resultados terminan guardados dentro de un HashMap.
                ));
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

        // Se recorre el ArrayList de palabras.
        for (String palabra : palabras2) {
            // merge recibe: clave, valorInicial y una Lambda que realiza la suma de frecuencia respectiva.
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
        // Se obtiene el set de entradas (clave, valor)
        return mapaFrecuencias.entrySet()
                // Se crea el flujo.
                .stream()
                // Filtra por el valor (la frecuencia a través de una lambda).
                .filter(m -> m.getValue() >= frecuencia)
                // Con .map, se saca la clave (la palabra) a través de otra lambda.
                .map(m -> m.getKey())
                // Se guarda el resultado en un ArrayList.
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
        // Se divide la frase en un array (usando espacios como separador).
        String[] palabras = frase.split(" ");

        // Este array de palabras se pasa a un flujo.
        return Arrays.stream(palabras)
                // Se filtran las palabras con longitud mínima con ayuda de una lambda.
                .filter(p -> p.length() >= longitud)
                // Con .map todas las palabras pasan a convertirse en minúsculas.
                .map(String::toLowerCase)
                // Todas las palabras que pasaron se almacenan en un HashSet (para evitar duplicados).
                .collect(Collectors.toCollection(HashSet::new));
    }
}


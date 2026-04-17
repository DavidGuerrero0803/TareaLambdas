import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //=======================================================================
        //                         PRUEBAS DE EJECUCIÓN
        //=======================================================================

        // EJERCICIO 1.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);

        EjerciciosStaticLambdas.multiplicadorArrayList(numeros, 2);

        // EJERCICIO 2.
        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("Dulce");
        cadena.add("Salado");
        cadena.add("Amargo");
        cadena.add("Agrio");

        EjerciciosStaticLambdas.filtradorSelectivo(cadena, 'A', 6);

        // EJERCICIO 3.
        ArrayList<String> cadena2 = new ArrayList<>();
        cadena2.add("Manzana");
        cadena2.add("Banana");
        cadena2.add("Limón");
        ArrayList<String> cadenaMayus = EjerciciosStaticLambdas.conversorDeMayusculas(cadena2);
        System.out.println("=== CONVERSOR DE MAYÚSCULAS ===");
        System.out.println(cadenaMayus);

        // EJERCICIO 4.
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(4);
        numeros2.add(5);

        HashSet<Integer> resultado = EjerciciosStaticLambdas.obtenerCuadradosUnicos(numeros2);
        System.out.println("=== CUADRADOS ÚNICOS ===");
        System.out.println(resultado);

        // EJERCICIO 5.
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Java");
        palabras.add("Java");
        palabras.add("Stream");
        palabras.add("Lambda");

        HashMap<String, Integer> palabrasLongitud = EjerciciosStaticLambdas.generarMapaLongitudes(palabras);
        System.out.println("=== MAPA DE LONGITUDES ===");
        System.out.println(palabrasLongitud);

        // EJERCICIO 6.
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Teclado", 45.0);
        inventario.put("Monitor", 300.1);
        inventario.put("Mouse", 25.5);
        inventario.put("Headset", 40.8);

        System.out.println("=== MODIFICADOR DE INVENTARIO ===");
        EjerciciosStaticLambdas.modificadorInventario(inventario);

        // EJERCICIO 7.
        ArrayList<String> palabras2 = new ArrayList<>();
        palabras2.add("Rosa");
        palabras2.add("Naranja");
        palabras2.add("Amarillo");
        palabras2.add("Amarillo");
        palabras2.add("Amarillo");
        palabras2.add("Verde");

        HashMap<String, Integer> palabrasConFrecuencia = EjerciciosStaticLambdas.contadorFrecuencias(palabras2);
        System.out.println("=== CONTADOR DE FRECUENCIAS ===");
        System.out.println(palabrasConFrecuencia);

        // EJERCICIO 8.
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
        mapaFrecuencias.put("Uno", 1);
        mapaFrecuencias.put("Cinco", 5);
        mapaFrecuencias.put("Siete", 7);
        mapaFrecuencias.put("Diez", 10);
        mapaFrecuencias.put("Doce", 12);

        ArrayList<String> palabrasFrecuentes = EjerciciosStaticLambdas.clasificadorPalabras(mapaFrecuencias, 6);
        System.out.println("=== CLASIFICADOR DE PALABRAS ===");
        System.out.println(palabrasFrecuentes);

        // EJERCICIO 9.
        String frase = "Esta es una prueba de escritura de una frase relativamente larga más una extensión";

        HashSet<String> palabrasGuardadas = EjerciciosStaticLambdas.deduplicacionPalabras(frase, 3);
        System.out.println("=== DEDUPLICACIÓN DE PALABRAS ===");
        System.out.println(palabrasGuardadas);

        // EJERCICIO 10.
        HashMap<String, Integer> palabrasPopulares = new HashMap<>();
        palabrasPopulares.put("Hola", 25);
        palabrasPopulares.put("Ok", 50);
        palabrasPopulares.put("Adiós", 20);
        palabrasPopulares.put("Taco", 8);

        int N = 20;
        EjerciciosStaticLambdas.topeFrecuencias(palabrasPopulares, N);
        System.out.println("Ajuste con un tope de " + N + ": " + palabrasPopulares);
    }
}
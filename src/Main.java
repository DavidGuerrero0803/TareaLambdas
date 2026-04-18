import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //=======================================================================
        //                         PRUEBAS DE EJECUCIÓN
        //=======================================================================

        // EJERCICIO 1.
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(10);
        enteros.add(20);
        enteros.add(0);
        enteros.add(null);

        int factor = 3;

        System.out.println("=== #1 MULTIPLICADOR ===");
        System.out.println("Enteros: " + enteros);
        EjerciciosStaticLambdas.multiplicadorArrayList(enteros, factor);

        System.out.println();

        // EJERCICIO 2.
        ArrayList<String> sabores = new ArrayList<>();
        sabores.add("Dulce");
        sabores.add("Salado");
        sabores.add("Amargo");
        sabores.add("Agrio");
        sabores.add("");

        int longitudAEliminar = 4;

        System.out.println("=== #2 FILTRO SELECTIVO ===");
        System.out.println("Lista de sabores: " + sabores);
        EjerciciosStaticLambdas.filtroSelectivo(sabores, 'S', longitudAEliminar);

        System.out.println();

        // EJERCICIO 3.
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Limón");
        frutas.add(null);
        frutas.add("");

        System.out.println("=== CONVERSOR DE MAYÚSCULAS ===");
        System.out.println("Listado de frutas: " + frutas);
        ArrayList<String> frutasMayus = EjerciciosStaticLambdas.conversorMayusculas(frutas);
        System.out.println("Listado en mayúsculas: " + frutasMayus);

        System.out.println();

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
        System.out.println("=== TOPE DE FRECUENCIAS ===");
        System.out.println("Ajuste con un tope de " + N + ": " + palabrasPopulares);
    }
}
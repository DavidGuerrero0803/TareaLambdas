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
        EjerciciosStaticNumeros.multiplicadorArrayList(enteros, factor);

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
        EjerciciosStaticCadenas.filtroSelectivo(sabores, 'S', longitudAEliminar);

        System.out.println();

        // EJERCICIO 3.
        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<String> listaVaciaString = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Limón");
        frutas.add(null);

        System.out.println("=== #3 CONVERSOR DE MAYÚSCULAS ===");
        System.out.println("Listado de frutas: " + frutas);
        ArrayList<String> frutasMayus = EjerciciosStaticCadenas.conversorMayusculas(frutas);
        ArrayList<String> frutasVacia = EjerciciosStaticCadenas.conversorMayusculas(listaVaciaString);
        System.out.println("Listado en mayúsculas: " + frutasMayus);
        System.out.println("Listado en mayúsculas VACÍO: " + frutasVacia);

        System.out.println();

        // EJERCICIO 4.
        ArrayList<Integer> numerosRepetidos = new ArrayList<>();
        ArrayList<Integer> listaVaciaInt = new ArrayList<>();
        numerosRepetidos.add(-2);
        numerosRepetidos.add(0);
        numerosRepetidos.add(1);
        numerosRepetidos.add(1);
        numerosRepetidos.add(2);
        numerosRepetidos.add(2);
        numerosRepetidos.add(3);
        numerosRepetidos.add(4);
        numerosRepetidos.add(4);
        numerosRepetidos.add(5);

        System.out.println("=== #4 CUADRADOS ÚNICOS ===");
        System.out.println("Números repetidos: " + numerosRepetidos);
        HashSet<Integer> resultadoCuadrados = EjerciciosStaticNumeros.cuadradosUnicos(numerosRepetidos);
        HashSet<Integer> resultadoVacio = EjerciciosStaticNumeros.cuadradosUnicos(listaVaciaInt);
        System.out.println("Números pares al cuadrado y sin repetidos: " + resultadoCuadrados);
        System.out.println("Números VACÍOS: " + resultadoVacio);

        System.out.println();

        // EJERCICIO 5.
        ArrayList<String> terminosProgramacion = new ArrayList<>();
        terminosProgramacion.add("Java");
        terminosProgramacion.add("Java");
        terminosProgramacion.add("Método");
        terminosProgramacion.add("Stream");
        terminosProgramacion.add("Lambda");
        terminosProgramacion.add("Lambda");

        System.out.println("=== #5 MAPA DE LONGITUDES ===");
        System.out.println("Palabras usadas en programación (con repetidos): " + terminosProgramacion);
        HashMap<String, Integer> palabrasLongitud = EjerciciosStaticCadenas.mapaLongitudes(terminosProgramacion);
        HashMap<String, Integer> palabrasVacio = EjerciciosStaticCadenas.mapaLongitudes(listaVaciaString);
        System.out.println("Palabras con su longitud (sin repetidos): " + palabrasLongitud);
        System.out.println("Palabras VACÍAS: " + palabrasVacio);

        System.out.println();

        // EJERCICIO 6.
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Teclado", 45.0);
        inventario.put("Monitor", 300.1);
        inventario.put("Mouse", 25.5);
        inventario.put("Headset", 40.8);
        inventario.put("Nada", 0.0);

        System.out.println("=== #6 MODIFICADOR DE INVENTARIO ===");
        EjerciciosStaticNumeros.modificadorInventario(inventario);
        // Impresión de un mapa vacío.
        EjerciciosStaticNumeros.modificadorInventario(new HashMap<>());

        System.out.println();

        // EJERCICIO 7.
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rosa");
        colores.add("Naranja");
        colores.add("Amarillo");
        colores.add("Amarillo");
        colores.add("Amarillo");
        colores.add("Amarillo");
        colores.add("Verde");

        System.out.println("=== #7 CONTADOR DE FRECUENCIAS ===");
        System.out.println("Colores: " + colores);
        HashMap<String, Integer> palabrasConFrecuencia = EjerciciosStaticCadenas.contadorFrecuencias(colores);
        HashMap<String, Integer> palabrasConNada = EjerciciosStaticCadenas.contadorFrecuencias(listaVaciaString);
        System.out.println("Existencia de colores (sin repetidos): " + palabrasConFrecuencia);
        System.out.println("Lista de colores VACÍA: " + palabrasConNada);

        System.out.println();

        // EJERCICIO 8.
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
        mapaFrecuencias.put("Cero", 0);
        mapaFrecuencias.put("Uno", 3);
        mapaFrecuencias.put("Cinco", 5);
        mapaFrecuencias.put("Siete", 5);
        mapaFrecuencias.put("Diez", 4);
        mapaFrecuencias.put("Dieciocho", 9);
        mapaFrecuencias.put("Diecisiete", 10);
        mapaFrecuencias.put("Cien", 100);

        int frecuencia = 6;

        System.out.println("=== #8 CLASIFICADOR DE PALABRAS ===");
        System.out.println("Mapa con números y frecuencias: " + mapaFrecuencias);
        ArrayList<String> palabrasFrecuentes = EjerciciosStaticCadenas.clasificadorPalabras(mapaFrecuencias, frecuencia);
        System.out.println("Números que son de una frecuencia >=" + frecuencia + ": " + palabrasFrecuentes);

        System.out.println();

        // EJERCICIO 9.
        String frase = "Esta es una prueba de escritura de una frase relativamente larga más una extensión";
        String vacio = "";

        int longitudMínima = 4;

        System.out.println("=== #9 DEDUPLICACIÓN DE PALABRAS ===");
        System.out.println("Ejemplo de frase: " + frase);
        HashSet<String> palabrasGuardadas = EjerciciosStaticCadenas.deduplicacionPalabras(frase, longitudMínima);
        HashSet<String> palabrasSinGuardar = EjerciciosStaticCadenas.deduplicacionPalabras(vacio, longitudMínima);
        System.out.println("Palabras guardadas sin duplicados:" + palabrasGuardadas);
        System.out.println("Ejemplo de frase VACÍA: " + palabrasSinGuardar);

        System.out.println();

        // EJERCICIO 10.
        HashMap<String, Integer> palabrasPopulares = new HashMap<>();
        palabrasPopulares.put("Hola", 25);
        palabrasPopulares.put("Ok", 50);
        palabrasPopulares.put("Adiós", 20);
        palabrasPopulares.put("Taco", 8);
        palabrasPopulares.put("Nada", 0);
        palabrasPopulares.put("Todo", 100);

        int tope = 20;

        System.out.println("=== #10 TOPE DE FRECUENCIAS ===");
        System.out.println("Palabras populares: " + palabrasPopulares);
        EjerciciosStaticNumeros.topeFrecuencias(palabrasPopulares, tope);
        System.out.println("Palabras ajustadas a un tope de " + tope + ": " + palabrasPopulares);
    }
}
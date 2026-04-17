import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
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
    }
}
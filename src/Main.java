import java.util.ArrayList;
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
    }
}
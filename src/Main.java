import java.util.ArrayList;

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

        ArrayList<String> cadena2 = new ArrayList<>();
        cadena2.add("Manzana");
        cadena2.add("Banana");
        cadena2.add("Limón");
        EjerciciosStaticLambdas.conversorDeMayusculas(cadena2);
        System.out.println(cadena2);
    }
}
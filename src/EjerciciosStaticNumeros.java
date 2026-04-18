import java.util.*;
import java.util.stream.Collectors;

/**
 * Esta clase maneja métodos estáticos ligados con números.
 *
 * @author David Guerrero.
 * @version 2.0.
 */
public class EjerciciosStaticNumeros {

    //=======================================================================
    //                     MÉTODOS ESTÁTICOS (NÚMEROS)
    //=======================================================================

    /**
     * multiplicadorArrayList() estático pide un ArrayList de números y un factor de multiplicación,
     * el resultado de las multiplicaciones se mostrarán en pantalla.
     * @param numeros (el ArrayList con los números).
     * @param factor (el factor por el que se van a multiplicar los números).
     */
    public static void multiplicadorArrayList(ArrayList<Integer> numeros, int factor) {
        // La lambda toma cada número (n) y lo reemplaza por el resultado de n * multiplicador.
        // Para evitar un error usando "null", se hace uso de un operador ternario.
        // Si es null, devolverá un 0, si no lo es, continuará con la multiplicación
        numeros.replaceAll(n -> (n == null) ? 0 : n * factor);
        System.out.println("Enteros multiplicados por un factor de " + factor + ": " + numeros);
    }

    /**
     * cuadradosUnicos() se encarga de filtrar números pares que haya
     * en un ArrayList con números, los eleva al cuadrado y los almacena en un HashSet.
     * @param numeros2 (el ArrayList que contiene enteros duplicados).
     * @return HashSet sin los duplicados y los pares multiplicados.
     */
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros2) {
        return numeros2.stream()
                // Dentro del filter, se condiciona a que solo pasen números pares.
                .filter(n -> n % 2 == 0)
                // Estos números seleccionados son elevados al cuadrado.
                .map(n -> n * n)
                // La colección se convierte en un Set (para eliminar duplicados).
                .collect(Collectors.toCollection(HashSet::new));
    }

    /**
     * modificadorInventario() recorre un inventario, aplicando un 10%
     * de descuento en el precio de los productos.
     * @param inventario (HashMap que contiene como clave: producto y valor: precio)
     */
    public static void modificadorInventario(HashMap<String, Double> inventario) {
        // Uso de BiConsumer, que consiste en (producto, precio) -> acción.
        inventario.forEach((producto, precio) -> {
            // Se realiza el cálculo y aplicación del descuento para cada producto en la colección.
            double descuentoAplicado = precio * 0.1;
            double precioConDescuento = precio - descuentoAplicado;
            // Se imprime de una vez el listado del inventario en 3 partes divididas.
            System.out.printf("Producto: %s, Precio: %.2f, Precio con descuento: %.2f%n",
                    producto, precio, precioConDescuento);
        });
    }

    /**
     * topeFrecuencias() ajusta todas las frecuencias de una palabra, es decir,
     * si una frecuencia supera el valor tope (N), se reduce a N.
     * @param mapaFrecuencias2 (HashMap que contiene de clave la palabra y la llave su "frecuencia").
     * @param N (es el tope al que la frecuencia puede llegar).
     */
    public static void topeFrecuencias(HashMap<String, Integer> mapaFrecuencias2, int N) {
        // replaceAll recibe clave y valor y actualiza el valor con el resultado de la lambda.
        mapaFrecuencias2.replaceAll((palabra, frecuencia) -> {
            // La condición es para comprobar si la frecuencia supera el tope (N).
            if (frecuencia > N) {
                // Si lo supera, devolverá el valor tope (N).
                return N;
            } else {
                // En caso contrario, conservará su valor original.
                return frecuencia;
            }
        });
    }
}


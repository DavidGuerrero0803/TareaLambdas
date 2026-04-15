import java.util.ArrayList;

public class EjerciciosStaticLambdas {

    //=======================================================================
    //                          MÉTODOS ESTÁTICOS
    //=======================================================================

    public static void multiplicadorArrayList(ArrayList<Integer> numeros, int multiplicador) {
        numeros.replaceAll(n -> n * 3);
        System.out.println("=== MULTIPLICADOR ===");
        System.out.println(numeros);
    }
}

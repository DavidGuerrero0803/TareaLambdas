import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);

        EjerciciosStaticLambdas.multiplicadorArrayList(numeros, 2);
    }
}
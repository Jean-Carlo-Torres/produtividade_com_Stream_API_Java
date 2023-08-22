package functional_interface.exemples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);

        // usar o Consumer com expressão lambda para imprimir números pares
        System.out.println("Número Pares:");
        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0){
//                System.out.print(numero + ", ");
//            }
        };

        // usar o Consumer para imprimir números pares no Stream
        numeros.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.println(n);
                    }
                }
        );
    }
}

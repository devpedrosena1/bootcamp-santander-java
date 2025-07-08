package br.com.dio.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar o Consumer com lambda expression para imprimir numeros pares
        Consumer<Integer> imprirmirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // usar o Consumer para imprimir os numeros no Stream
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });

        // podemos fazer isso utilizando lambda expression
        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}

package br.com.dio.main;

import br.com.dio.exceptions.ParametrosInvalidosExceptions;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // parametros
        System.out.println("Informe o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            Contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println(e.getMessage());
        }

    }

    static void Contar(int parametroUm, int parametroDois) {

        if (parametroUm > parametroDois) throw new ParametrosInvalidosExceptions(
                "O parametro um DEVE ser MAIOR que o parametro dois"
        );

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }

    }

}

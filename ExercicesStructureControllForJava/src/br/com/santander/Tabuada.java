package br.com.santander;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            var resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

        scanner.close();

    }

}

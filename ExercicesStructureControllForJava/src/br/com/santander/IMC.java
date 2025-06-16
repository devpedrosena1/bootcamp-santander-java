package br.com.santander;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        var altura = scanner.nextDouble();

        System.out.println("Informe sua peso: ");
        var peso = scanner.nextDouble();

        var calculoIMC = peso / (altura * altura);

        if (calculoIMC <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (calculoIMC >= 18.6 && calculoIMC <= 24.9) {
            System.out.println("Peso ideal");
        }
        else if (calculoIMC >= 25 && calculoIMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (calculoIMC >= 30 && calculoIMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        }
        else if (calculoIMC >= 35 && calculoIMC <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        }
        else if (calculoIMC >= 40) {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
        else {
            System.out.println("Opção inválida!");
        }


    }

}

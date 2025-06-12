package br.com.santander;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Hello, welcome to the world!";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int age = sc.nextInt();

        System.out.printf("Olá, %s! Sua idade é %d anos!", name, age);

    }

}

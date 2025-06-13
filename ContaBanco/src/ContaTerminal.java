import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // name
        System.out.println("Olá! Por gentileza, informe seu nome: ");
        var name = scanner.nextLine();
        System.out.printf("\nOlá, %s! Seja bem vindo ao sistema do Banco! \n", name);

        // number account
        System.out.println("\nPor favor, informe o número da conta: ");
        var numeroConta = scanner.nextInt();
        scanner.nextLine(); // para consumir a quebra de linha

        // agency
        System.out.println("\nAgora informe a sua agência por gentileza: ");
        var agencia = scanner.nextLine();

        // balance
        System.out.println("\nPor fim, informe o saldo que deseja depositar para iniciar a sua conta: ");
        var saldo = scanner.nextDouble();

        System.out.println("=== Informações da Conta: ");
        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco! \n", name);
        System.out.println(
                "\nSeus dados são: " +
                        "\nAgência: " + agencia +
                        "\nNúmero da conta: " + numeroConta +
                        "\nSaldo: " + saldo +
                "\nSeu saldo já está disponível. \n\nEm breve lançaremos a plataforma para depósitos e saques!"
        );

    }
}

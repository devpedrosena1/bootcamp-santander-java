import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Bem vindo ao cadastro de usários. Selecione a operação desejada: ");

            System.out.println("1. Cadastro");
            System.out.println("2. Atualizar");
            System.out.println("3. Excluir");
            System.out.println("4. Buscar");
            System.out.println("5. Listar");
            System.out.println("6. Sair");

            var userInput = scanner.nextInt();

            var selectedOption = MenuOption.values()[userInput -1];
            switch (selectedOption) {
                case SAVE -> {
                    var user = requestToSave();
                    dao.save(user);
                    System.out.printf("Usuário %s cadastrado com sucesso!", user);
                }
                case UPDATE -> {
                    try {
                        var user = requestToUpdate();
                        dao.update(user);
                        System.out.printf("Usuário %s atualizado com sucesso!", user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case DELETE -> {
                    try {
                        var user = requestId();
                        dao.delete(user);
                        System.out.printf("Usuário %s deletado com sucesso!", user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var users = dao.findById(id);
                        System.out.printf("Usuários com id: %s", id);
                        System.out.println(users);
                    }
                    catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }

                }
                case FIND_ALL -> {
                   var users = dao.findAll();
                    System.out.println("Usuários cadastrados: ");
                    System.out.println("======================");
                    users.forEach(System.out::println);
                    System.out.println("==========fim============");
                }
                case EXIT -> System.exit(0);
            }

        }

    }

    private static long requestId(){
        System.out.println("Informe o identificador do usuário: ");
        return scanner.nextLong();
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.next();

        System.out.println("Informe o e-mail do usuário: ");
        var email = scanner.next();

        System.out.println("Informe a data de nascimento (dd/MM/yyyy): ");
        var birthdayString = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return new UserModel(0, name, email, birthday);

    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o identificador do usuário: ");
        var id = scanner.nextLong();

        System.out.println("Informe o nome do usuário: ");
        var name = scanner.next();

        System.out.println("Informe o e-mail do usuário: ");
        var email = scanner.next();

        System.out.println("Informe a data de nascimento (dd/MM/yyyy): ");
        var birthdayString = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return new UserModel(id, name, email, birthday);

    }

}

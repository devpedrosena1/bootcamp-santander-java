import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Maria", 21),
                new User("Pedro", 22),
                new User("Ana", 23)
        );

        printStringValue(User::name, users);
        printStringValue(user -> String.valueOf(user.age()), users);
        printStringValue(Record::toString, users);

        var consumer = new Consumer<User>(){
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };
        users.forEach(consumer);

        // usando lambda expression
        users.forEach((User user) -> System.out.println(user));
        users.forEach(System.out::println);

    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}

import java.util.Optional;

public class Temp {
    public static void main(String[] args) {
        String name = "temp";

        Optional<String> maybeString = Optional.ofNullable(checkpoint());

        // If present, print the value; otherwise, print a default message
        maybeString.ifPresentOrElse(
                value -> System.out.println("Value: " + value),
                () -> System.out.println("No value present")
        );
    }

    public static String checkpoint() {
        return null;
    }
}

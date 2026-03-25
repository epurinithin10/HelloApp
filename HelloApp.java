public class HelloApp {

    public static void main(String[] args) {

        String names;

        // Default case
        if (args.length == 0) {
            names = "World";
        } else {
            // Direct join
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}
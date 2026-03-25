public class HelloApp {

    public static void main(String[] args) {

        String greeting;

        // If no names provided
        if (args.length == 0) {
            greeting = "World";
        } else {

            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {

                names.append(args[i]);

                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            greeting = names.toString();
        }

        System.out.println("Hello, " + greeting + "!");
    }
}
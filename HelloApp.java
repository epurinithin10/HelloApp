public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Multiple names using enhanced for loop
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {

            if (!first) {
                nameBuilder.append(", ");
            }

            nameBuilder.append(name);
            first = false;
        }

        System.out.println("Hello, " + nameBuilder + "!");
    }
}
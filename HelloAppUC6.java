public class HelloAppUC6 {

    public static void main(String[] args) {

        // No names
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with comma
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print result
            System.out.println("Hello, " + names + "!");
        }
    }
}
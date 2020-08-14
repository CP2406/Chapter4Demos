import textio.TextIO;

public class VariousDemos {
    public static void main(String[] args) {
        try {
            TextIO.put("Enter min: ");
            var min = TextIO.getlnInt();
            TextIO.put("Enter max: ");
            var max = TextIO.getlnInt();
            var secretNumber = RandomHelper.nextInt(min, max);

            TextIO.putf("I'm thinking of a number between %d and %d, what is it? ", min, max);
            var userGuess = TextIO.getlnInt();

            if (secretNumber == userGuess) {
                TextIO.putln("You guessed correctly");
            } else {
                TextIO.putln("That's incorrect, bad luck...");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }

        FunctionR2R function; // function is a variable of type FunctionR2R

        // these are all equivalent - just different syntax
        function = (double x) -> { return x*x; };
        function = (x) -> { return x*x; };
        function = x -> { return x*x; };
        function = x -> x*x;
        function = (double fred) -> fred*fred;
        function = (z) -> z*z;

        System.out.println(function.valueAt(10)); // then it can be used!

//        function = x -> Math.sqrt(x); // square root of a number
        function = Math::sqrt; // square root of a number, method reference version
        System.out.println(function.valueAt(10)); // and another way!

    }
}

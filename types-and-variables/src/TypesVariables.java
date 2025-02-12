// Some comments are to explain some concepts.
// It's help me recognize about important concepts.
import java.util.Locale;

public class TypesVariables {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        // Primitive types
        int age = 32;
        double income = 4578.32;
        String zipcode = "0457654-40"; // if the field aren't a math operator don't use integers
        String name = "John Doe";
        String city = "New York";
        final double VALUE_PI = 3.14; // const variable, need be declared with reserved word final and with UpperCase.
        String cpf = "057.515.545-45"; // if the field aren't a math operator don't use integers
        long cpf2 = 4657651654654L;

        // casting concept
        short numbShort = 1;
        int normalNumb = numbShort;
        short numbShort2 = (short) normalNumb; // if you're trying this, it's only possible if we're converting the type to short, declaring.

        System.out.printf("My name is %s, I'm %d years old, I make %.2f and I live in %s%n", name, age, income,
                zipcode, city);
    }
}
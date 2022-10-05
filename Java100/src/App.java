/**
 * App
 */
public class App {

    public static void main(String[] args) {
        /**
         * Naming a variable
         * 
         * - A-Z a-z
         * - 0-9, but must never begin with numbers
         * - Special characters that can be used are $ _
         * 
         * Note:
         * - A variable must never start with a numbers
         * - The identifier must not have a space in between
         */

        // Declaring variables in Java
        //char author_name;
        //char bookName;
 
 
        // Integer
        // A short type is a 16 bit signed integer
        //short age1; // Stores from +32,767 to -32,768

        // An int type is a 32 bit signed integer   
        //int age2; // Stores from +2,147,483,647 to -2,147,483,648

        // A long type is a 64 bit signed integer
        //long age3; // Stores from +9,223,372,036,854,775,807 to -9,223,372,036,854,775,808

        // Floating Point
        float radius_float = 0.00000000000863872078f;
        System.out.println(radius_float);
        double radius_double = 0.00000000000863872078; //will identify as 'double'
        // double radius = 0.00000000000863872078d; //adding 'd' identifier for convention
        System.out.println(radius_double);

        System.out.println(((Object)radius_double).getClass().getName()); //Checking datatype

        //Char - 16bit data type that contains a single digit or character
        char letter = 'A';
        System.out.println(letter);

        char number_as_text = '6';
        System.out.println(number_as_text);

        char number = 65;
        System.out.println(number);

        //Boolean
        boolean part_time = false;
        System.out.println(part_time);

        //Null - a value that does not refer to any object.
        //String line;
        // System.out.println(line); //error: variable line might not have been initialized
        //above identifier has not been initialized and hence has a null value.

        //String literals
        System.out.println("Backspace: "+ "\b");
        System.out.println("Tab: "+ "\t");
        System.out.println("Newline: "+ "\n");
        System.out.println("Double Quote: "+ "\"");
        System.out.println("Single Quote: "+ "\'");
        System.out.println("Backslash: "+ "\\");

        // Implicit type casting
        short a = 10;
        int b = a;
        System.out.println(b);
        // Explicit type casting
        int x = 5;
        short y = (short) x;
        System.out.println(y);

        int i = 11;
        String twenty = "9";
        System.out.println(i + twenty);

        // String methods
        // concat
        String str_1 = "hello";
        String str_2 = "world";
        String str_3 = str_1 + str_2;
        System.out.println(str_3);

        //comparing strings
        String str_4 = "helloworld";
        System.out.println(str_3.equals(str_4));
        System.out.println(str_3 == str_4);

        // split a string
        String greet = "Hello World";
        String[] output = greet.split("");
        System.out.println(output[0]);
        System.out.println(output[1]);

        // substring
        String choice = "CoffeeOrTea";
        System.out.println(choice.substring(8));
        System.out.println(choice.substring(0, 6));

        // cases
        System.out.println(greet.toUpperCase());
        System.out.println(greet);

        //String immutability - they cannot be modified once created.
        String str1 = "    hello   ";
        System.out.println(str1.trim()); 
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        //Hence, to save changes to the String, we must assign it to the new String.
        String str2 = str1.trim().toUpperCase();
        System.out.println(str2);
    }
}
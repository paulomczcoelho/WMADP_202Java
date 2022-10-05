public class MathFunctions {
    public static void main(String[] args) {
        
        //Java Math Class ---> java.lang package

        //Exponentiation
        //pow(2,3) returns 8
        //exp(2) returns e^2 (Euler's constant = 2.71828) 
        //sqrt(16) returns 4
        //cbrt(27) returns 3

        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3));
        System.out.println("Exponent squared is: " + Math.exp(2));
        System.out.println("The square root of 16 is: " +Math.sqrt(16));
        System.out.println("The cube root of 27 is: " +Math.cbrt(27));

        //Maximum and Minimum
        System.out.println("Maximum between 2.06 and 2.3: " + Math.max(2.06, 2.3));
        System.out.println("Minimum between 2.06 and 2.3: " + Math.min(2.000000001f, 2.3));
    }
}
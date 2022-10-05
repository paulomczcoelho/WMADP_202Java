public class LogicalExpressions {
    
    public static void main(String[] args) {
        /**
     * Comparative operators
     * 
     * Less than <
     * Greater than >
     * Less than or equal to <=
     * Greater than or equal to >=
     * Equal to ==
     * Not equal to !=
     */

     int x = 5;
     int y = 10;

     System.out.println("x is equal to:" +x);
     System.out.println("y is equal to:" +y);

     System.out.println("x is greater than y");
     System.out.println(x > y);

     System.out.println("x is lesser than y");
     System.out.println(x < y);

     System.out.println("x is greater than or equal to y");
     System.out.println(x >= y);

     System.out.println("x is lesser than or equal to y");
     System.out.println(x <= y);

     System.out.println("x is equal to y");
     System.out.println(x == y);

     System.out.println("x is not equal to y");
     System.out.println(x != y);


     /**
      * Boolean/Logical operators
            Boolean NOT !
            Boolean AND &&
            Boolean OR ||
            Boolean exclusive XOR ^ - will return true if one of the expressions evaluates to true and the other to false
      */

      boolean m = false;
      boolean n = false;

      System.out.println("Value of x: " +m);
      System.out.println("Value of y: " +m);

      System.out.println("Boolean NOT of m");
      System.out.println(!m);

      System.out.println("Boolean AND of m and n");
      System.out.println(m && n);

      System.out.println("Boolean OR of m and n");
      System.out.println(m || n);

      System.out.println("Boolean exclusive XOR of m and n");
      System.out.println(m ^ n);
        
    }

}
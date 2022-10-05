public class ArithmeticOperators {
    public static void main(String[] args) throws Exception {
        
        int answer;

        System.out.println("ADDITION");

        int add = 20;

        System.out.println("Initial value: " +add);
        answer = add + 2;
        System.out.println("add + 2 = " + answer);

        System.out.println("SUBTRACTION");
        int sub = 15;

        System.out.println("Initial value: " + sub);
        System.out.println("sub - 4 = " + (sub - 4));
        System.out.println("sub = " + sub);
        System.out.println();

        System.out.println("MULTIPLICATION");
        int mult = 25;

        System.out.println("Initial value: " + mult);
        answer = mult * 3;
        System.out.println("mult * 3 = " + answer);
        answer = mult;
        System.out.println("mult = " + mult);
        System.out.println();

        /** */
        System.out.println("DIVISION");
        int divi = 11;
        System.out.println("Initial value: " +divi);
        // answer = divi/4;
        double answerDouble = divi/4.0;
        System.out.println("divi / 4 = " + answerDouble);
        // System.out.println();

        System.out.println("MODULO (REMAINDER)");
        int rem = 5;

        System.out.println("Initial value: " +rem);
        answer = rem % 5;
        System.out.println("rem % 2 = " + answer);
        answer = rem;
        System.out.println("rem = " + answer + "\n");
        
        
        System.out.println("PREINCREMENT BY ONE");
        int pre_inc = 5;

        System.out.println("Initial value: " +pre_inc);
        System.out.println("++pre_inc = " + (++pre_inc));
        System.out.println("pre_inc = " + pre_inc);
        System.out.println();

        System.out.println("POSTINCREMENT BY ONE");
        int post_inc = 5;

        System.out.println("Initial value: " +post_inc);
        System.out.println("post_inc++ = " + (post_inc++));
        System.out.println("post_inc = " + post_inc);
        System.out.println();

        System.out.println("PREDECREMENT BY ONE");
        int pre_dec = 5;

        System.out.println("Initial value: " + pre_dec);
        answer = --pre_dec;
        System.out.println("--pre_dec   = " + answer);
        answer = pre_dec;
        System.out.println("pre_dec = " + answer);
        System.out.println();

        System.out.println("POSTDECREMENT BY ONE");
        int post_dec = 5;

        System.out.println("Initial value: " + post_dec);
        answer = post_dec--;
        System.out.println("post_dec--   = " + answer);
        answer = post_dec;
        System.out.println("post_dec = " + answer);
        System.out.println();

        //Operator associativity - (1 + 2 - 5)

        int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;
        int answer2;

        System.out.println("x:" +x);
        System.out.println("y:" +y);
        System.out.println("z:" +z);

        System.out.println("Calculating expression containing operator with the same precedence");

        answer2 = x+y-z;
        System.out.println("x+y-z = " + answer2);

        /**
         * Unary Plus and Minus 
         * +, -
         * RIGHT to LEFT
         * 
         * Addition and Subtraction
         * +, -
         * LEFT to RIGHT
         * 
         * Multiplication, Division and Modulo(Remainder)
         * *, /, %
         * LEFT to RIGHT
         */

    }
}
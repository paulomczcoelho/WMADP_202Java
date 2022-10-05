public class ConditionalStatement {

    public static void main(String[] args) {

        /**
         * COMPARISON OPERATORS
         * 
         * if-then-else
         * the "switch-case" construct
         * 
         */

        // The IF statement
        int x = 4;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x == 4) {
            System.out.println("x is equal to 4");
        } else {
            System.out.println("x is less than 4");
        }

        // Switch case construct

        int y = 2;
        int temp;

        switch (y) {
            case 1:
                temp = 1;
                break;
            case 2:
                temp = 2;
                break;
            default:
                temp = 3;
                break;
        }

        System.out.println("Value of temp = " +temp);



        int i = 4;
        int temp2;

        switch (i) {
            case 1:
            case 2:
            case 3:
                temp2 = 0;
                break;
            case 4:
                temp2 = 4;
                break;
            default:
                temp2 = 5;
                break;
        }
        System.out.println("Value of i = " +temp2);

        //Ternary operator
        // (condition) ? expressionIfTrue : expressionIfFalse

        int a = 10;
        int b = 5;
        int answer;

        answer = (a < b) ? a : b;
        System.out.println("Answer using conditional: " + answer);

        if(a < b){
            answer = a;
        }else{
            answer = b;
        }
    }
}
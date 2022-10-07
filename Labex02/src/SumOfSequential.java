import java.util.Scanner;

public class SumOfSequential {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int numb  = 0; 
        int result = 0;

        System.out.println("Input the number:");
        numb = scan.nextInt();    
        
        for (int i = 1; i <= numb; i++ ){
           
             result = result + i;
           //System.out.println("The sum of 1 to" +numb+ " is: " + result);
        }
        System.out.println("The sum of 1 to " +numb+ " is: " + result);

        scan.close();

    }
}

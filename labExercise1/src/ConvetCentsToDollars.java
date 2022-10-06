import java.util.Scanner;
import java.text.DecimalFormat;


public class ConvetCentsToDollars {
    
    public static void main(String[] args) {
        Scanner scan;
        int inputData;

        scan = new Scanner(System.in);
        
        System.out.println("Write how many money you have in cents.");
        inputData = scan.nextInt();   
      
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(inputData /100 ));

        scan.close();
        
    }
}

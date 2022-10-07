import java.util.Scanner;

public class RunOfIntegers{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int first = 0; 
        int last = 0;
       
        System.out.println("Input the start:");
        first = scan.nextInt();
        System.out.println("Input the end:");
        last = scan.nextInt();
       
        if (first < last){
            System.out.println("Numbers between " + first + " and " +last+" are: ");
            for (int i = first ; i < last; i++){    
                System.out.println( i);   
            }
            
        }    
        scan.close();
    }
}
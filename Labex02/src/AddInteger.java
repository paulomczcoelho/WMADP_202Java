import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int qtd = 0;
        int sum = 0; 
        System.out.println("Write how many umbers will be add up.");
        qtd = scan.nextInt();

        for(var i = 1; i <= qtd; i++){
            System.out.println("Enter an integer: " + i + "º number");
            int number = scan.nextInt();
            sum = sum + number;
 
        }
        System.out.println(sum);

    }
}

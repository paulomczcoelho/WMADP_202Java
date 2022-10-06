import java.util.Scanner;

public class MultiplicationTable {


public static void main(String[] args) {
       
   Scanner scan;
   scan = new Scanner(System.in);
   int inputData;
       
   System.out.println("write the number to be multiplicate");
   inputData = scan.nextInt();

      for (int i = 1; i < 11; i++){
          System.out.println(inputData +" x " + i + " = " + inputData * i);
      }
      scan.close();    
   }  

}
    


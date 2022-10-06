import java.util.Scanner;

public class areaOfCircle {
    
    public static void main(String[] args) {
        
        final double PI = 3.1415;
        double area;

        int radius;  
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the radius value");
        radius = input.nextInt();
        area = radius * radius * PI;
        System.out.println("The radius area is: " + area);
        input.close();
    }
}
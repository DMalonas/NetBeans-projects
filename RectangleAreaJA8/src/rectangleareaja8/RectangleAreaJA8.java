package rectangleareaja8;

import java.util.Scanner;

public class RectangleAreaJA8 {
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the length of Rectangle:");
        double width = scanner.nextDouble();
        double area = length*width;
        System.out.println("Area of Rectangle is" +area);
    
    }
    
}

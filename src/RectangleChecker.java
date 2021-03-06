import java.util.Scanner;

public class RectangleChecker {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x coordinate: ");
        int x = input.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = input.nextInt();

        System.out.println("Enter width: ");
        int width  = input.nextInt();
        System.out.println("Enter height: ");
        int height = input.nextInt();

        BetterRectangle creatingRectangles = new BetterRectangle(x,y,width,height);

        double rectangleArea = creatingRectangles.getArea();
        double rectanglePerimeter = creatingRectangles.getPerimeter();

        System.out.printf("The perimeter of the rectangle is: %2.1f",rectanglePerimeter);
        System.out.printf("\nThe area of the rectangle is: %2.1f\n",rectangleArea);

    }
}

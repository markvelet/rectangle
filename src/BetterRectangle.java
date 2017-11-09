
import java.awt.Rectangle;
import java.util.Scanner;

public class BetterRectangle extends Rectangle
{

    public BetterRectangle(int xPoint, int yPoint, int width, int height)
    {
        setLocation(xPoint,yPoint);
        setSize(width, height);
    }

    public double getPerimeter()
    {
        return getHeight() * 2 + getWidth() * 2;
    }

    public double getArea()
    {
        return getHeight() * getWidth();
    }


}
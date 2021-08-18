import java.util.Scanner;

public class RectangleAreaPerimeter {
    private int l,b;
   /* public void setL(int l)
    {
        this.l=l;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public int getL(int l)
    {
        return l;
    }
    public int getB(int b)
    {
        return b;
    }*/

   public RectangleAreaPerimeter(int l, int b) {
        this.l=l;
        this.b=b;
    }

    public int area() {
        return l*b;
    }

    public int perimeter() {
        return 2*(l+b);
    }
}

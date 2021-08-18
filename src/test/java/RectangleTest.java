import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void toCheckAreaisSixwhenIntegersAre3and2()
    {
        RectangleAreaPerimeter rectangle=new RectangleAreaPerimeter(3,2);
        /*rectangle.setL(3);
        rectangle.setB(2);*/
        int actualvalue=rectangle.area();
        assertEquals(6,actualvalue);
    }

    @Test
    public void toCheckAreais8WhenIntegersAreMinus4andMinus2()
    {
        RectangleAreaPerimeter rectangle=new RectangleAreaPerimeter(-4,-2);
        int actualvalue=rectangle.area();
        assertEquals(8,actualvalue);
    }

    @Test
    public void toCheckPerimeteris10WhenIntegersAre4andMinus1()
    {
        RectangleAreaPerimeter rectangle=new RectangleAreaPerimeter(4,1);
        int actualvalue=rectangle.perimeter();
        assertEquals(10,actualvalue);
    }

    @Test
    public void toCheckPerimeterisMinus14WhenIntegersAreMinus5andMinus2()
    {
        RectangleAreaPerimeter rectangle=new RectangleAreaPerimeter(-5,-2);
        int actualvalue=rectangle.perimeter();
        assertEquals(-14,actualvalue);
    }




}


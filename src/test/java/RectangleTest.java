import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void toCheckAreaisSixwhenIntegersAre3and2()
    {
        RectangleAreaPerimeter rectangle=new RectangleAreaPerimeter(3,2);
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




}


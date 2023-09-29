import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testCalculateArea() {
        double value = Circle.calculateArea(10);
        Assertions.assertEquals(314, Math.floor(value));
    }


}

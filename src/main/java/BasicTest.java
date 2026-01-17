import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void testAdd(){
        int a = 45;
        int b = 65;
        int expected = 115;

        Assert.assertEquals(a+b, expected,"Addition failed");
    }

    @Test
    public void testSubtract(){
        int a = 45;
        int b = 65;
        int expected = 20;
        Assert.assertEquals(a-b, expected,"Subtraction failed");
    }

    @Test
    public void testMultiply(){
        int a = 45;
        int b = 65;
        int expected = 230;
        Assert.assertEquals(a*b, expected,"Multiplication failed");
    }

    @Test
    public void testDivide(){
        int a = 45;
        int b = 65;
        int expected = 20;
        Assert.assertEquals(a/b, expected,"Divide failed");
    }
}

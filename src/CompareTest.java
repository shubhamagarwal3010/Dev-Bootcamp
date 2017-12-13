import org.junit.Assert;
import org.junit.Test;

public class CompareTest {
    @Test
    public void verifyIfSixIsGreaterFour(){
        Compare compare = new Compare(6,4);
        Assert.assertEquals(true,  compare.isGreater());
    }
    @Test
    public void verifyIfSixIsGreaterFivty(){
        Compare compare = new Compare(60,5);
        Assert.assertEquals(false.isGreater());
    }
}

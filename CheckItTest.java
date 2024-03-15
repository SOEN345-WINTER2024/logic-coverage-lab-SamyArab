import org.junit.Assert;
import org.junit.Test;
/**
 * The following tests check for the following statement:
 *       if (a || (b && c))
 */
public class CheckItTest {

    @Test
    public void testWithAEqualToTrue() {
        Assert.assertEquals("P is true", CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testWithBEqualToFalse() {
        Assert.assertEquals("P isn't true", CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testWithBandCEqualToTrue() {
        Assert.assertEquals("P is true", CheckIt.checkIt(false, true, true));
    }
    
    @Test
    public void testWithCEqualToFalse() {
        Assert.assertEquals("P isn't true", CheckIt.checkIt(false, true, false));
    }
}

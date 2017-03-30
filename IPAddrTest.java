
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IPAddrTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IPAddrTest
{
    /**
     * Default constructor for test class IPAddrTest
     */
    public IPAddrTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void toStringTest()
    {
        IPAddr iPAddr1 = new IPAddr(192, 168, 1, 10);
        assertEquals("192.168.1.10", iPAddr1.toString());
        IPAddr iPAddr2 = new IPAddr(127, 0, 0, 1);
        assertEquals("127.0.0.1", iPAddr2.toString());
    }
    
        @Test
    public void stringConstructor()
    {
        IPAddr iPAddr1 = new IPAddr("192.168.1.10");
        assertEquals("192.168.1.10", iPAddr1.toString());
    }
}


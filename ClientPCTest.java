
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClientPCTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClientPCTest
{
    /**
     * Default constructor for test class ClientPCTest
     */
    public ClientPCTest()
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
    public void ip_toString()
    {
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        ClientPC clientPC1 = new ClientPC("1234356");
        clientPC1.setIPaddress(iPAddr1);
        assertEquals(" \n129.234.0.2 1234356", clientPC1.toString());
    }

    @Test
    public void setIP(){
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        ClientPC clientPC1 = new ClientPC("1234356");
        clientPC1.setIPaddress(iPAddr1);
        assertEquals(clientPC1.getIPaddress(), iPAddr1);

    }
}


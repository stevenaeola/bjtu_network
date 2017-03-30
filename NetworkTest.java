
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NetworkTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NetworkTest
{
    private Network network1;
    private ClientPC clientPC1;
    /**
     * Default constructor for test class NetworkTest
     */
    public NetworkTest()
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
        network1 = new Network();
        clientPC1 = new ClientPC("1234567");
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
    public void initialiseNetwork()
    {
        assertEquals(0, network1.getNumberOfPCs());
    }

    @Test
    public void addOnePCSize()
    {
        network1.addDevice(clientPC1);
        assertEquals(1, network1.getNumberOfPCs());
    }

    @Test
    public void removePCsize()
    {
        network1.addDevice(clientPC1);
        network1.removeDevice(clientPC1);
        assertEquals(0, network1.getNumberOfPCs());
    }
}




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
    private ClientPC clientPC1;
    
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
        clientPC1 = new ClientPC("PC", "Dell", "123456");
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
        clientPC1.setIPAddress(iPAddr1);
        assertEquals(" \n129.234.0.2 1234356", clientPC1.toString());
    }

    @Test
    public void setIP(){
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        clientPC1.setIPAddress(iPAddr1);
        assertEquals(clientPC1.getIPaddress(), iPAddr1);

    }

    @Test
    public void save_to_file(){
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        clientPC1.setIPAddress(iPAddr1);
        clientPC1.saveToFile("PC1.txt");

    }

    @Test
    public void save_to_file_broken() throws java.io.IOException{
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        clientPC1.setIPAddress(iPAddr1);
        clientPC1.saveToFile2("broken/PC1.txt");

    }
    
        @Test
    public void save_and_load() throws Exception {
        IPAddr iPAddr1 = new IPAddr(129, 234, 0, 2);
        clientPC1.setIPAddress(iPAddr1);
        clientPC1.saveToFile("PC1.txt");
        
        ClientPC clientPC2 = new ClientPC("PC1.txt");
        
        assertEquals(clientPC1, clientPC2);

    }
}


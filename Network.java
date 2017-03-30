import java.util.*;

public class Network
{
    private List<DeviceInterface> pcs;

    public Network(){
        pcs = new ArrayList<DeviceInterface>();
    }

    public int getNumberOfPCs(){
        return pcs.size();
    }

    public void addDevice(DeviceInterface device){
        pcs.add(device);
    }

    /**
     * interactive addition of ClientPC
     */
    public void addPC(){
        // get mac address from the console

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the MAC address");
        String mac = sc.next();
        System.out.println("Please enter the IP address");
        String ip_str = sc.next();

        IPAddr ip = new IPAddr(ip_str);

        ClientPC pc = new ClientPC(mac);
        pc.setIPAddress(ip);
        String yn ="";
        while(!yn.equals("y") && !yn.equals("n")){
            System.out.println("Here is your new PC, is this correct(y/n)? " + pc);
            yn = sc.next();
        }
        if(yn.equals("n")){
                return;
        }
        pcs.add(pc);
    }

    public void removeDevice(DeviceInterface device){
        pcs.remove(device);
    }

    public void printPCs(){
        for( DeviceInterface device : pcs ){
            System.out.println(device);
        }

    }
}

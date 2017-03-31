import java.io.*;
import java.util.Scanner;

public class ClientPC implements DeviceInterface
{
    private IPAddr ip_address;
    private String mac_address;
    private String manufacturer;
    private String model;

    public ClientPC(String mac_address, String manufacturer, String model){
        this.mac_address = mac_address;
        this.manufacturer = manufacturer;
        this.model = model;
    }
    
    /**
     * creates an object based on a previusly saved file
     */
    public ClientPC(String fname) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fname));
        manufacturer = sc.nextLine();
        model = sc.nextLine();
        ip_address = new IPAddr(sc.nextLine());
        mac_address = sc.nextLine();
    }

    public IPAddr getIPaddress(){
        return ip_address;
    }

    public String getMacAddress(){
        return mac_address;
    }

    public void setIPAddress(IPAddr ip_address){
        this.ip_address = ip_address;
    }

    public String toString(){
        return manufacturer + "\n" + model + "\n" + ip_address.toString() + "\n" + mac_address;
    }

    public void saveToFile(String fname){

        try{
            FileWriter writer = new FileWriter(fname);
            writer.write(toString());
            writer.close();
        }
        catch(IOException e){
            System.out.println("Ooops " + e);
        }
    }

    public void saveToFile2(String fname) throws IOException{
            FileWriter writer = new FileWriter(fname);
            writer.write(toString());
            writer.close();

    }
}

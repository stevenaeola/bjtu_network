
public class ClientPC
{
   private IPAddr ip_address;
   private String mac_address;
   private String manufacturer;
   private String model;
   
   public ClientPC(String mac_address){
       this.mac_address = mac_address;
       manufacturer ="";
       model = "";
   }
    
   public IPAddr getIPaddress(){
       return ip_address;
    }
    
    public String getMACaddress(){
       return mac_address;
    }
    
    public void setIPaddress(IPAddr ip_address){
        this.ip_address = ip_address;
    }
    
    public String toString(){
        return manufacturer + " " + model + "\n" + ip_address.toString() + " " + mac_address;
    }
}

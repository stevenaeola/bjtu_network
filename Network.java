import java.util.ArrayList;

public class Network
{
    private ArrayList<ClientPC> pcs;
    
    public Network(){
        pcs = new ArrayList<ClientPC>();
    }
    
    public int getNumberOfPCs(){
        return pcs.size();
    }
    
    public void addPC(ClientPC pc){
        pcs.add(pc);
    }
    
    public void removePC(ClientPC pc){
        pcs.remove(pc);
    }
    
    public void printPCs(){
        for( ClientPC pc : pcs ){
            System.out.println(pc);
        }
        
    }
}

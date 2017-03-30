
public class IPAddr
{
    private int[] bytes;

    public IPAddr(int a, int b, int c, int d){
        bytes = new int[4];
        bytes[0] = a;
        bytes[1] = b;
        bytes[2] = c;
        bytes[3] = d;
    }

    public IPAddr(String ipstr){
        bytes = new int[4];
        String[] bits = ipstr.split("\\.");
        System.out.println("length of bits " + bits.length);
        for(int index = 0; index<4 && index < bits.length; index++){
            System.out.println ("index " + index + "bits[index]" + bits[index]);
            bytes[index] = new Integer(bits[index]);
        }
    }

    public String toString(){
        String str = "" + bytes[0];
        int index = 1;
        while(index<4){
            str += "." + bytes[index];
            index++;
        }
        return str;
    }

}

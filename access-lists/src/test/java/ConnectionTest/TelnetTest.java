package ConnectionTest;

import java.io.IOException;
import java.net.UnknownHostException;

import Connection.Telnet;
import junit.framework.TestCase;

public class TelnetTest extends TestCase {
	Telnet telnet ; 
	
public static String server ; 
public static int port ; 
	   
	   // assigning the values
	   protected void setUp() {
		   server = "10.63.10.206";
		   port= 23;
	
	   }
	  
	   public void testTelnet() throws UnknownHostException, IOException{
		   telnet = new Telnet(server,port) ; 
	     
	   }


}

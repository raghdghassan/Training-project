package Testing;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Connection.*;
import Regex.Regex;
import junit.framework.TestCase;

public class TelnetTest extends TestCase {
	Connection telnet;
	Regex regex ;

	public static String server;
	public static int port;
	public static String password;

	// assigning the values
	@Before
	protected void setUp() {
		server = "10.63.10.206";
		port = 23;
		password = "lab";

	}

	@Test
	public void testTelnet() throws IOException{
		telnet = new Telnet(server, port,password);
	telnet.send("show interfaces");
		//telnet.send("sh run");
		//System.out.println(telnet.receive());
		regex= new Regex (telnet.receive());
	
	}
	
		//
		//telnet.receive();
		//System.out.println(telnet.receive());
	}



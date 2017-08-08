package Testing;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.Before;
import org.junit.Test;

import Connection.Telnet;
import junit.framework.TestCase;

public class TelnetTest extends TestCase {
	Telnet telnet;

	public static String server;
	public static int port;

	// assigning the values
	@Before
	protected void setUp() {
		server = "10.63.10.206";
		port = 23;

	}

	@Test
	public void testTelnet() throws UnknownHostException, IOException {
		telnet = new Telnet(server, port);

	}

}

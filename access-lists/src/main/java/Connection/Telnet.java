package Connection;

import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.commons.net.telnet.TelnetClient;

import java.io.*;

public class Telnet implements Connection {
	private Socket socket;
	private InputStream in;
	private PrintStream out;
	private TelnetClient telnet;

	public Telnet(String server, int port) throws UnknownHostException, IOException {
		
		
		

		BufferedReader in = null;
		socket = new Socket(server, port);
		PrintWriter out = null;
		BufferedReader stdIn = null;
		String command = null;
		
	/*	
		try {telnet.connect(server, port);
		telnet.setSoTimeout(15000);
		
		} catch (Exception e) {
			throw new IllegalArgumentException("  X_X sorry fails to connect x_x");
		}
		*/
		//createInOutStream();
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //device log
			socket.setSoTimeout(20000);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			command = in.readLine();
			command = in.readLine();
			stdIn = new BufferedReader(new InputStreamReader(System.in));
			while (!(command = in.readLine()).contains("User")) {
				System.out.println(command);
			}
			System.out.println(command);
			System.out.print("Password : ");
			out.println(stdIn.readLine());
			command = in.readLine();
			System.out.print("Command : ");
			out.println(stdIn.readLine());
			command = in.readLine();
			System.out.println(command = in.readLine());
			if (command.contains(">")) {
				System.out.print("Password : ");
				out.println(stdIn.readLine());
				command = in.readLine();
				while (true) {
					out.println("\n");
					if ((command = in.readLine()).contains("#")) {
						System.out.print(command);
						out.println(stdIn.readLine());
					}
					while (!(command = in.readLine()).equals("end") && !command.contains("#"))
						System.out.println(command);
					System.out.println(command);
					command = in.readLine();
					
					
				}
			}
		/*	System.setOut(new PrintStream(new FileOutputStream("output.txt")));
			System.out.println("This is test output");*/
			
		} catch (Exception e) {
			System.exit(1);
		}
		// out.close();
		// in.close();
		// stdIn.close();
		// ClientSocket.close();

	//}
		
	}

}
	
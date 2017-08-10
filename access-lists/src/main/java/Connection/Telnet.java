package Connection;

import java.net.Socket;
import java.net.UnknownHostException;

import org.apache.commons.net.telnet.TelnetClient;

import java.io.*;

public class Telnet implements Connection {
	private Socket socket;
	private String d;
	private BufferedReader in; // device dialog
	private String command;
	private PrintWriter out = null; // device output
	private BufferedReader stdIn = null; // user input commands

	public Telnet(String server, int port, String password) throws UnknownHostException, IOException {
		socket = new Socket(server, port);
		try {
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
			out.println(password);
			command = in.readLine();
			out.println("en");
			command = in.readLine();
			System.out.println(command = in.readLine());
			if (command.contains(">")) {
				out.println(password);
				out.println("\n");
			}
		//	send("sh run");
			/*
			 * if (command.contains(">")) { System.out.print("Password : ");
			 * out.println(stdIn.readLine()); command = in.readLine(); while (true) {
			 * out.println("\n"); if ((command = in.readLine()).contains("#")) {
			 * 
			 * System.out.print(command); out.println(stdIn.readLine()); } while (!(command
			 * = in.readLine()).equals("end") && !command.contains("#"))
			 * System.out.println(command); System.out.println(command); command =
			 * in.readLine();
			 * 
			 * 
			 * 
			 * }
			 */
			// }
			/*
			 * System.setOut(new PrintStream(new FileOutputStream("output.txt")));
			 * System.out.println("This is test output");
			 */
		} catch (Exception e) {
			System.exit(1);
		}
	}

	public String receive() throws IOException {
		String x = "";
		while (!(command = in.readLine()).equals("end") && !command.contains("#")) {
			//System.out.println(command);
			x = x.concat(command);
			x = x.concat("\n");
		}
		return x;
	}

	public void send(String userCommand) throws IOException {

		command = in.readLine();
			if ((command = in.readLine()).contains("#")) {
				System.out.print(command);
				System.out.println(userCommand);
				out.println(userCommand);
				out.println("\n");
				in.readLine();
				in.readLine();
		}
	}
}

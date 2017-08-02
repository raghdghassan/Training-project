package Connection;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class Telnet extends Connection {
	Socket socket;
	

	public Telnet(String server, int port) throws UnknownHostException, IOException {
		
		super(server, port);
		

		BufferedReader in = null;
		socket = new Socket(server, port);
		PrintWriter out = null;
		BufferedReader stdIn = null;
		String command = null;
		try {
			PrintStream myConsole = new PrintStream(new File("output.txt"));
			System.setOut(myConsole);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //device log
			socket.setSoTimeout(20000);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			command = in.readLine();
			command = in.readLine();
			stdIn = new BufferedReader(new InputStreamReader(System.in));
			while (!(command = in.readLine()).contains("User")) {
				System.out.println(command);
				myConsole.print(command);
			}
			System.out.println(command);
			myConsole.print(command);
			System.out.print("Password : ");
			myConsole.print("Password : ");
			out.println(stdIn.readLine());
			myConsole.print(stdIn.readLine());
			command = in.readLine();
			System.out.print("Command : ");
			myConsole.print("Command : ");
			out.println(stdIn.readLine());
			myConsole.print(stdIn.readLine());
			command = in.readLine();
			System.out.println(command = in.readLine());
			myConsole.print(command = in.readLine());
			if (command.contains(">")) {
				System.out.print("Password : ");
				myConsole.print("Password : ");
				out.println(stdIn.readLine());
				myConsole.print(stdIn.readLine());
				command = in.readLine();
				while (true) {
					out.println("\n");
					if ((command = in.readLine()).contains("#")) {
						System.out.print(command);
						myConsole.print(command);
						out.println(stdIn.readLine());
						myConsole.print(stdIn.readLine());
					}
					while (!(command = in.readLine()).equals("end") && !command.contains("#"))
						{System.out.println(command);
						myConsole.print(command);
						}
					System.out.println(command);
					myConsole.print(command);
					command = in.readLine();
					
					
				}
			}
			
			
		} catch (Exception e) {
			System.exit(1);
		}
		// out.close();
		// in.close();
		// stdIn.close();
		// ClientSocket.close();

	}

}

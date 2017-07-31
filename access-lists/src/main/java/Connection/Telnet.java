package Connection;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
import java.util.*;

public class Telnet extends Connection {
	Socket socket;

	public Telnet(String server, int port) throws UnknownHostException, IOException {
		super(server,port);

		final String FILENAME = "C:\\Users\\exalt\\eclipse-workspace\\Training\\day10\\filename.txt";
		BufferedWriter bw = null;
		FileWriter fw = null;

		BufferedReader in = null;

		socket = new Socket(server, port);
		PrintWriter out = null;
		BufferedReader stdIn = null;

		try {

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			socket.setSoTimeout(20000);

			out = new PrintWriter(socket.getOutputStream(), true);
			// in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String command = in.readLine();
			if (in != null)

				System.out.println(in);

		} catch (UnknownHostException e) {

			System.exit(1);
		} catch (IOException e) {

			System.exit(1);
		}

		String userInput;
		stdIn = new BufferedReader(new InputStreamReader(System.in));
		String temp = in.readLine();
		out.println("lab");
		// System.out.println("Type Message (\"exit\" to quit)");
		do {
			System.out.println(temp);
		} while (!(temp = in.readLine()).contains("Password"));
		System.out.print(temp);
		while (temp != "end") {
			userInput = stdIn.readLine();
			out.println(userInput);
			System.out.println(in.readLine());

		}
		try {

			// String content = "This is the content to write into file\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(in.readLine());

			// System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

		 out.close();
		 in.close();
		 stdIn.close();
		 socket.close();

	}

}

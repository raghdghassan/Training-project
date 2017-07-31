package Regex;

import java.io.IOException;
import java.net.UnknownHostException;

import Connection.Telnet;

public class Regex {

	public static void main(String[] args) {
		try {
			Telnet telnet = new Telnet ("10.63.10.206",23);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	

	}
	

}


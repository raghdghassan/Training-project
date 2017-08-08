package Regex;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.regex.*;

import Connection.Connection;
import Connection.Snmp;
import Connection.Ssh;
import Connection.Telnet;
import modelObjects.Interface;
import modelObjects.PolicyMap;

public class Regex {

	// public List<Interface> interfaces;
/*	public static Interface interfaces;
	public static String mtu;
	public static String name;
	public static String duplex;
	public static String status;

//	public static void main(String[] args) throws IOException {

		String test1 = "MTU 1500 bytes, BW 1000000 Kbit/sec, DLY 1000 usec,\\r\\n";
		String regex1 = "MTU\\s(.*?)\\sbytes";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(test1);
		
		while (matcher1.find()) {
			System.out.println(matcher1.group());
			mtu = matcher1.group();
		}

		String test = "Full Duplex, 1000Mbps, link type is auto, media type is SX";
		String regex = "(Full Duplex|Half Duplex|Bateekh Duplex)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(test);
		while (matcher.find()) {
			System.out.println(matcher.group());
			duplex = matcher.group();

		}
		String test2 = "GigabitEthernet0/1/0 is up, line protocol is up\r\n";
		String regex2 = "Giga(.*?)\\sis";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(test2);
		while (matcher2.find()) {
			System.out.println(matcher2.group());
			name = matcher2.group();

		}

		String test3 = "GigabitEthernet0/1/0 is up, line protocol is up\r\n";
		String regex3 = "is\\s(.*?)\\sline";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(test3);
		while (matcher3.find()) {
			System.out.println(matcher3.group());
			status = matcher3.group();

		}

		interfaces = new Interface(name, status, mtu, duplex);
		System.out.println(interfaces.toString());
*/
	//}

}

package Regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import modelObjects.Duplex;
import modelObjects.Interface;

public class Regex {
	private String mtu;
	private String name;
	private Duplex duplex;
	private String status;
	public Interface myInterface;


	public Regex(String x) {
		 //System.out.println(x);
		String[] parts = x.split("Giga");

		// for ( int i=0 ; i<parts.length;i++) {
		// System.out.println("/********************************************************/
		// \n");
		// System.out.println(parts[i]);
		// }
		getInforemation(parts);
	}

	private void getInforemation(String[] parts) {
		ArrayList<Interface> intrfaces = new ArrayList<Interface>();
		for (int i = 0; i < parts.length; i++) {
			String regex2 = "bitEthernet(.*?)\\sis";
			Pattern pattern2 = Pattern.compile(regex2);
			Matcher matcher2 = pattern2.matcher(parts[i]);
			while (matcher2.find()) {
				System.out.println("Name is : ");
				System.out.println("Giga" + matcher2.group(1)+"\n");
				name = matcher2.group(1);

			}

			String regex3 = "(up|down|administratively down).*?\\sline";
			Pattern pattern3 = Pattern.compile(regex3);
			Matcher matcher3 = pattern3.matcher(parts[i]);
			while (matcher3.find()) {
				System.out.println("Status is : ");
				System.out.println(matcher3.group(1)+"\n");
				status = matcher3.group(1);

			}

			String regex1 = "MTU\\s(.*?)\\sbytes";
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher matcher1 = pattern1.matcher(parts[i]);

			while (matcher1.find()) {
				System.out.println("MTU is : ");
				System.out.println(matcher1.group(1)+"\n");
		
				mtu = matcher1.group(1);
			}

			String regex = "(Full|Half)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(parts[i]);
			while (matcher.find()) {
				System.out.println(matcher.group(1)+"\n");
				duplex=duplex.valueOf(matcher.group(1)) ;

			}
			myInterface = new Interface(name, status, mtu, duplex);
			intrfaces.add(myInterface);
			//interfaces.addInterface(interfaces);
	
			
		
			

		}
		for(int i=0;i<intrfaces.size();i++)
			System.out.println(intrfaces.get(i).toString());
		
	
	//	System.out.println(interfaces1.toString());
		
		/*for(Interface ele : interfaces1)
		{
			System.out.println(ele+"            $$$$$            ");
		}*/
		
		//System.out.println(interfaces1);
		

	}

	// public List<Interface> interfaces;
	/*
	 * public static Interface interfaces;
	 * 
	 * 
	 * 
	 * 
	 * String test1 = "MTU 1500 bytes, BW 1000000 Kbit/sec, DLY 1000 usec,\\r\\n";
	 * String regex1 = "MTU\\s(.*?)\\sbytes"; Pattern pattern1 =
	 * Pattern.compile(regex1); Matcher matcher1 = pattern1.matcher(test1);
	 * 
	 * while (matcher1.find()) { System.out.println(matcher1.group()); mtu =
	 * matcher1.group(); }
	 * 
	 * String test = "Full Duplex, 1000Mbps, link type is auto, media type is SX";
	 * String regex = "(Full Duplex|Half Duplex|Bateekh Duplex)"; Pattern pattern =
	 * Pattern.compile(regex); Matcher matcher = pattern.matcher(test); while
	 * (matcher.find()) { System.out.println(matcher.group()); duplex =
	 * matcher.group();
	 * 
	 * } String test2 = "GigabitEthernet0/1/0 is up, line protocol is up\r\n";
	 * String regex2 = "Giga(.*?)\\sis"; Pattern pattern2 = Pattern.compile(regex2);
	 * Matcher matcher2 = pattern2.matcher(test2); while (matcher2.find()) {
	 * System.out.println(matcher2.group()); name = matcher2.group();
	 * 
	 * }
	 * 
	 * String test3 = "GigabitEthernet0/1/0 is up, line protocol is up\r\n"; String
	 * regex3 = "is\\s(.*?)\\sline"; Pattern pattern3 = Pattern.compile(regex3);
	 * Matcher matcher3 = pattern3.matcher(test3); while (matcher3.find()) {
	 * System.out.println(matcher3.group()); status = matcher3.group();
	 * 
	 * }
	 * 
	 * interfaces = new Interface(name, status, mtu, duplex);
	 * System.out.println(interfaces.toString());
	 */
}

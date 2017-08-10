package Connection;

import java.io.IOException;

public interface Connection {
	
	public String receive() throws IOException;
	public void send(String s) throws IOException;
	

}

package Connection;

import java.io.IOException;

public interface Connection {
	
	public String receive();
	public void send() throws IOException;
	

}

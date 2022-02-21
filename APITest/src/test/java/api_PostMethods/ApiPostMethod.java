package api_PostMethods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiPostMethod {
	
	
	public void post_Method() throws Exception {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		
		String JsonBudy="{\"name\":\"Raja\",\"salary\":\"5000\",\"age\":\"30\"}";
		
		byte[] input=JsonBudy.getBytes();
		
		OutputStream strem = connection.getOutputStream(); 
		strem.write(input);
		
		InputStream input_strem= connection.getInputStream();
		
		InputStreamReader input_reader= new InputStreamReader(input_strem);
		
		BufferedReader reader = new BufferedReader(input_reader);
		
		StringBuffer buffer = new StringBuffer();
		
		String line;
		
		while((line=reader.readLine()) !=null)
		{
			buffer.append(line);
		}
		
		System.out.println("Message is : "+buffer);
	}

	
	public static void main(String[] args) throws Exception {
		ApiPostMethod obj =  new ApiPostMethod();
		obj.post_Method();
	}
}

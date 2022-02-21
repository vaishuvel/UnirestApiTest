package api_put_methods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Java_Put_methods {
	
	public static void main(String[] args) throws Exception {
		
		
		URL url  = new URL("http://dummy.restapiexample.com/api/v1/update/9583"); 
		
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setDoOutput(true);
		
		String json_Body="{\"name\":\"Arun\",\"salary\":\"125000\",\"age\":\"31\"}";
		
		byte[] json_byte=json_Body.getBytes();
		
		OutputStream out_strem=connection.getOutputStream();
		out_strem.write(json_byte);
		
		int status_code=connection.getResponseCode();
		
		String status_message=connection.getResponseMessage();
		
		System.out.println("Status code is : "+status_code);
		System.out.println("Status message is : "+status_message);
		InputStream stream= connection.getInputStream();
		  InputStreamReader reader = new InputStreamReader(stream);
		  
		  BufferedReader buffer = new BufferedReader(reader);
		   String line;
		   StringBuffer string_buffer= new StringBuffer();
		   while((line=buffer.readLine())!=null) {
			   string_buffer.append(line);
		   }
		   
		   System.out.println(string_buffer);
	}
		
		
	}

	

package api_PostMethods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JavApiPostMethod {
	
	public void post_Methods() throws Exception {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		
		connection.setDoOutput(true);
		
		String json_Body="{\"name\":\"Arun\",\"salary\":\"125000\",\"age\":\"30\"}";
		
		byte[] json_byte=json_Body.getBytes();
		
		OutputStream strem =connection.getOutputStream();
		
		strem.write(json_byte);
		
		int status_code=connection.getResponseCode();
		
		String status_msg=connection.getResponseMessage();
		
		System.out.println("Status code is : "+status_code);
		System.out.println("Status message is : "+status_msg);
		
		InputStream in_stream =connection.getInputStream();
		
		InputStreamReader in_reader= new InputStreamReader(in_stream);
		 BufferedReader in_buffer = new BufferedReader(in_reader);
		 
		 String line;
		 
		 StringBuffer str_buffer = new StringBuffer();
		 
		 while((line=in_buffer.readLine())!=null)
		 {
			 str_buffer.append(line);
		 }
		 System.out.println("resource : "+str_buffer);
		 
	}

	
	public static void main(String[] args) throws Exception {
		JavApiPostMethod obj = new JavApiPostMethod();
		obj.post_Methods();
	}
}

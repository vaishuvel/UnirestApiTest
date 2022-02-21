package api_GetMethods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiJavaGetMethod {
	
	
	public void getMethods() throws Exception {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employee/9583");
		
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
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

	
	public static void main(String[] args) throws Exception {
		
		ApiJavaGetMethod obj =new ApiJavaGetMethod();
		
		obj.getMethods();
	}
}

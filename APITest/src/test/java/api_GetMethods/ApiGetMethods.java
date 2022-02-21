package api_GetMethods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiGetMethods {
	
	
	
	public  void api_getMethods() throws Exception {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employee/1");
		
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int status_code=connection.getResponseCode();
		String status_message=connection.getResponseMessage();
		System.out.println("status message : "+status_message);
		System.out.println("status code : "+status_code);
		
		InputStream sterem= connection.getInputStream();
		
		InputStreamReader reader= new InputStreamReader(sterem);
		
		BufferedReader buffer = new BufferedReader(reader);
		
		
		StringBuffer output =new StringBuffer();
		String line;
		while((line=buffer.readLine()) != null)
		{
			output.append(line);
		}
		
		
		System.out.println("Out message : "+output);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		ApiGetMethods api_methods= new ApiGetMethods();
		
		api_methods.api_getMethods();
		
	}

}

package api_delete_methods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaDeletemethods {
	
	public static void main(String[] args) throws Exception {
		
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/9583");
		
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setDoOutput(true);
		
		int code=connection.getResponseCode();
		String msg=connection.getResponseMessage();
		
		System.out.println("Status code is : "+code);
		System.out.println("status msg is : "+msg);
		
		InputStream stream= connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream);
		
		BufferedReader buff = new BufferedReader(reader);
		
		String line;
		
		StringBuffer stringvalue= new  StringBuffer();
		while((line=buff.readLine())!=null)
		{
			stringvalue.append(line);
		}
		
		System.out.println(stringvalue);
		
	}

}

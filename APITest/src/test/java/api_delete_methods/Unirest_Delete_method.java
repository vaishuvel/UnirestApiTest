package api_delete_methods;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirest_Delete_method {
	
	public static void main(String[] args) throws Exception {
		
		
		HttpResponse<JsonNode> response=Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/6866").header("accept", "application/json").asJson();
		
		System.out.println(response.getStatus());
		System.out.println(response.getStatusText());
		System.out.println(response.getBody());
		
//		InputStream stream= response.getRawBody();
//		InputStreamReader reader = new InputStreamReader(stream);
//		 BufferedReader buff =  new  BufferedReader(reader);
//		   String line;
//		   
//		   StringBuffer buffer= new StringBuffer();
//		   
//		   while((line=buff.readLine())!=null) {
//			   buffer.append(line);
//		   }
//		   
//		   System.out.println(buffer);
	}

}

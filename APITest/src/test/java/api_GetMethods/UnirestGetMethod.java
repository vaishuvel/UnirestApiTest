package api_GetMethods;

import java.net.HttpURLConnection;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestGetMethod {
	
	public static void main(String[] args) throws UnirestException {
		
		 HttpResponse<JsonNode> response=Unirest.get("http://dummy.restapiexample.com/api/v1/employee/6866").header("accept", "application/json").asJson();
		 
//		 int status_code=response.getStatus();
//		 String status_message=response.getStatusText();
//		JsonNode body= response.getBody();
//		 
		 System.out.println("Status code : "+response.getStatus());
		 System.out.println("Status message : "+response.getStatusText());
		 System.out.println("Body : "+response.getBody());
		 
	}

}

package api_put_methods;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirest_Put_Method {
	
	public static void main(String[] args) throws Exception {
		

		String json="{\"age\":\"72\"}";
		byte[] value=json.getBytes();
		HttpResponse<JsonNode> response=Unirest.put("http://dummy.restapiexample.com/api/v1/update/6866").header("accept", "application/json").header("content-type", "application/json").body(value).asJson();
		
		System.out.println(response.getStatus());
		
		System.out.println(response.getStatusText());
		
		System.out.println(response.getBody());
	}

}

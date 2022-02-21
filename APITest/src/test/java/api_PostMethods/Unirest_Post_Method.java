package api_PostMethods;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Unirest_Post_Method {

	public static void main(String[] args) throws Exception {

		String json="{\"name\":\"Ram\",\"salary\":\"100\",\"age\":\"20\"}";
		byte[] value=json.getBytes();
		HttpResponse<JsonNode> reponse=Unirest.post("http://dummy.restapiexample.com/api/v1/create").header("accept", "application/json").header("content-type", "application/json").body(value).asJson();

		System.out.println(reponse.getStatus());
		System.out.println(reponse.getStatusText());

		System.out.println(reponse.getBody());
		System.out.println(reponse.getHeaders());
		System.out.println(reponse.getRawBody());
	}
}


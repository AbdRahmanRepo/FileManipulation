
import java.io.FileWriter;

//Before need to add JsonSimple Dependency
public class JsonWriting {
	public static void main(String[] args) {
		JSONObject JsonObject = new JSONObject();
		JsonObject.put("Name","AbdulRahman");
		JsonObject.put("Age","24");
		//JsonArrays
		
		JSONArray JsonArray = new JSONArray();
		JsonArray.add("Automation Tester");
		JsonArray.add("Quality Assurance");
		
		JsonObject.put("Roles",JsonArray);
		
		FileWriter fileWriter = new FileWriter("AbdulRahman.json");
		fileWriter.write(JsonObject.toJSONString()); // Write as Json Format file
		fileWriter.close();
			
	}
}

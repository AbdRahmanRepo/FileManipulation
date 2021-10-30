
import java.io.FileReader;
import java.util.Iterator;

public class JsonReading {
	public static void main(String[] args) {
		
		JSONParser jsonParser =new JSONParser();
		//JSONParse Like a Translator..used to read file Json file
		
		FileReader fr = new FileReader("AbdulRahman.json");
		
		Object ParsedObject = jsonParser.Parse(fr); //here the file reading as json
		
		JSONObject jsObj =(JSONObject) ParsedObject;
		//to get json Data as String
		String name =(String) jsObj.get("Name");
		//to get json Data as Int or Long
		Long age =(Long) jsObj.get("Age");
		//to get json array data
		JSONArray array = (JSONArray) jsObj.get("Roles");
		
		Iterator iterator = array.Iterator();
		System.out.println("Name is:"+ name);
		System.out.println("Age is:"+age);
		while(iterator.hasNext()) {
			System.out.println("Roles:  "+iterator.next());
		}
		
		
		
		
		
	}
	
}

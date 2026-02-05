package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {

    final static String jsonFilePath = System.getProperty("user.dir")+"\\testData.json";

    @Test
    public void readJsonFile() throws IOException, ParseException {
        FileReader file = new FileReader(jsonFilePath);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(file);
        System.out.println(json.toJSONString());
        JSONArray jsonData = (JSONArray) json.get("testData");
        System.out.println(jsonData.toJSONString());
        JSONObject loginTest = (JSONObject) jsonData.get(0);
        System.out.println(loginTest.toJSONString());
        System.out.println(loginTest.get("testName"));
    }
}

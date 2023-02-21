package utils;

import lombok.SneakyThrows;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class DataManager {


    @SneakyThrows
    public static String parseData(String jsonType,String key) {
        try (FileReader reader = new FileReader(FilePathsUtil.getTestPath(jsonType))) {
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(reader);
            return (String) obj.get(key);
        }
    }
}
package utils;

import java.io.File;
import java.nio.file.Paths;

public class FilePathsUtil {
    public static String getTestPath(String fileName) {
        return Paths.get("src","test","resources", fileName).toString();
    }

    public static String getAbsolutePath(String fileName){
        File file=new File(fileName).getAbsoluteFile();
        return file.getAbsolutePath();
    }
}

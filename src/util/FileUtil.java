package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class FileUtil {

    public static void main(String[] args) throws IOException {
        System.out.println(writeToFile("hello"));
    }

    public static boolean writeToFile(String result){

        try {
            FileWriter writer = new FileWriter("result.txt", true);
            writer.write(result);
            writer.flush();
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

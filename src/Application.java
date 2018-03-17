import app.Arithmetic;
import util.FileUtil;

import java.io.File;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class Application {

    public static void main(String[] args) {

        File file = new File("result.txt");
        if (file.exists()){
            file.delete();
        }

        FileUtil.writeToFile("201571030107\n");

        for (int i = 0; i < 4; i++){
            if (Arithmetic.generate()){
                System.out.println("SUCCESS");
            }
        }
    }
}

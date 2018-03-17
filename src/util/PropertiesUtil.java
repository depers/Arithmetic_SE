package util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class PropertiesUtil {

    private static Properties props;

    static {
        String fileName = "mmall.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        } catch (IOException e) {
            System.out.print("配置文件读取异常：" + e);
        }
    }

    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        if(value == null || value.equals("")){
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key,String defaultValue){

        String value = props.getProperty(key.trim());
        if(value == null || value.equals("")){
            value = defaultValue;
        }
        return value.trim();
    }
}

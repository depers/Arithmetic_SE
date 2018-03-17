package util;

import java.util.Random;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class RandomUtil {

    public static void main(String[] args) {
        System.out.println(generateRandomNum(0, 100));
    }


    public static int generateRandomNum(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

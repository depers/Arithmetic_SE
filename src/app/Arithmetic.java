package app;

import util.CalculateUtil;
import util.FileUtil;
import util.RandomUtil;

import java.io.IOException;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class Arithmetic {

    private static int firstNum, secondNum, thirdNum, result;
    private static String firstOperator, secondOperator;
    private final static String[] OPERATOR = {"+", "-", "*", "/"};

    public static boolean generate() {
        while (true) {

            // generator params
            firstNum = RandomUtil.generateRandomNum(1, 100);
            secondNum = RandomUtil.generateRandomNum(1, 100);
            thirdNum = RandomUtil.generateRandomNum(1, 100);

            firstOperator = OPERATOR[RandomUtil.generateRandomNum(0, 3)];
            secondOperator = OPERATOR[RandomUtil.generateRandomNum(0, 3)];

            // compute
            if (secondOperator.equals("*") || secondOperator.equals("/")) {
                int prepResult = CalculateUtil.compute(secondNum, thirdNum, secondOperator);
                result = CalculateUtil.compute(firstNum, prepResult, firstOperator);
            } else {
                int prepResult = CalculateUtil.compute(firstNum, secondNum, firstOperator);
                result = CalculateUtil.compute(prepResult, thirdNum, secondOperator);
            }

            // judge result
            if (result > 0) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(firstNum)
                        .append(" ")
                        .append(firstOperator)
                        .append(" ")
                        .append(secondNum)
                        .append(" ")
                        .append(secondOperator)
                        .append(" ")
                        .append(thirdNum)
                        .append(" = ")
                        .append(result)
                        .append("\n");

                // write to file
                if (FileUtil.writeToFile(buffer.toString())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}

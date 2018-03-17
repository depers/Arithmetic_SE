package app;

import util.CalculateUtil;
import util.FileUtil;
import util.RandomUtil;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class BracketsCompute {

    public static String compute(String firstOperator, String secondOperator, String thirdOperator, int... numArgs) {
        int temp = RandomUtil.generateRandomNum(0, 3);
        StringBuffer buffer = new StringBuffer();

        switch (temp) {

            case 0: {
                buffer.append(numArgs[0]).append(",")
                        .append(firstOperator).append(",")
                        .append("(").append("(").append(",")
                        .append(numArgs[1]).append(",")
                        .append(secondOperator).append(",")
                        .append(numArgs[2]).append(",")
                        .append(")").append(",")
                        .append(thirdOperator).append(",")
                        .append(numArgs[3]).append(",")
                        .append(")");
                break;
            }

            case 1: {
                buffer.append("(").append(",")
                        .append(numArgs[0]).append(",")
                        .append(firstOperator).append(",")
                        .append("(").append(",")
                        .append(numArgs[1]).append(",")
                        .append(secondOperator).append(",")
                        .append(numArgs[2]).append(",")
                        .append(")").append(")").append(",")
                        .append(thirdOperator).append(",")
                        .append(numArgs[3]);
                break;
            }

            case 2: {
                buffer.append(numArgs[0]).append(",")
                        .append(firstOperator).append(",")
                        .append("(").append(",")
                        .append(numArgs[1]).append(",")
                        .append(secondOperator).append(",")
                        .append("(").append(",")
                        .append(numArgs[2]).append(",")
                        .append(thirdOperator).append(",")
                        .append(numArgs[3]).append(",")
                        .append(")").append(",").append(")");
                break;
            }

            case 3: {
                buffer.append("(").append(",")
                        .append(numArgs[0]).append(",")
                        .append(firstOperator).append(",")
                        .append(numArgs[1]).append(",")
                        .append(")").append(",")
                        .append(secondOperator).append(",")
                        .append("(").append(",")
                        .append(numArgs[2]).append(",")
                        .append(thirdOperator).append(",")
                        .append(numArgs[3]).append(",")
                        .append(")");
                break;
            }
        }

        return buffer.toString();
    }
}

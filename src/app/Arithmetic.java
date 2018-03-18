package app;

import util.*;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class Arithmetic {

    private static int firstNum, secondNum, thirdNum, forthNum, result;
    private static String firstOperator, secondOperator, thirdOperator;
    private final static String[] OPERATOR = {"+", "-", "*", "/"};

    public static boolean generate() {
        while (true) {

            // Generator params
            firstNum = RandomUtil.generateRandomNum(1, 100);
            secondNum = RandomUtil.generateRandomNum(1, 100);
            thirdNum = RandomUtil.generateRandomNum(1, 100);
            forthNum = RandomUtil.generateRandomNum(1, 100);

            firstOperator = OPERATOR[RandomUtil.generateRandomNum(0, 3)];
            secondOperator = OPERATOR[RandomUtil.generateRandomNum(0, 3)];
            thirdOperator = OPERATOR[RandomUtil.generateRandomNum(0, 3)];

            // The operation contains more than two operators
            if (firstOperator.equals(secondOperator) && firstOperator.equals(thirdOperator)){
                continue;
            }

            // Add brackets
            String infixExpression = BracketsCompute.compute(firstOperator, secondOperator, thirdOperator,
                    firstNum, secondNum, thirdNum, forthNum);

            // Convert the infix expression to a suffix expression, then calculate
            try {
                result = SuffixToValueUtil.compute(InfixToSuffixUtil.prefixToSuffix(infixExpression));
            } catch (Exception e) {
                // e.printStackTrace();
                continue;
            }

            // Judge result
            if (result > 0) {
                StringBuffer buffer = new StringBuffer();
                String[] str = infixExpression.split(",");
                for (int i = 0; i < str.length; i++) {
                    buffer.append(str[i]);
                }
                buffer.append(" = ").append(result).append("\n");

                // Write to file
                if (FileUtil.writeToFile(buffer.toString())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}

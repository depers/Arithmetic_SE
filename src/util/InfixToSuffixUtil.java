package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class InfixToSuffixUtil {

    public static void main(String[] args) {
        // System.out.println(prefixToSuffix("(,30,*,(,11,-,25,),),/,11"));
    }

    private static Stack<String> stack = new Stack<String>();
    private static String[] operator = {"+", "-", "*", "/"};
    private static Map<String, Integer> priority = new HashMap<>();

    static {
        priority.put("*", 2);
        priority.put("/", 2);
        priority.put("+", 1);
        priority.put("-", 1);
        priority.put("", -1);
    }


    private static boolean isOperator(String str) {
        for (int i = 0; i < operator.length; i++) {
            if (operator[i].equals(str)) {
                return true;
            }
        }
        return false;
    }


    private static String getTopOperator() {
        String tmp = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            tmp = stack.get(i);
            if ("(".equals(tmp)) {
                break;
            } else if (isOperator(tmp)) {
                return tmp;
            }
        }
        return "";
    }

    public static String prefixToSuffix(String express) throws Exception {

        String[] expression = express.split(",");
        StringBuffer suffixStr = new StringBuffer();
        String temp = "";

        try {
            for (int i = 0; i < expression.length; i++) {
                if (SuffixToValueUtil.isNum(expression[i])) {
                    suffixStr.append(expression[i]).append(" ");
                } else if (expression[i].equals(")")) {
                    temp = stack.pop();
                    while (!temp.equals("(")) {
                        suffixStr.append(temp).append(" ");
                        temp = stack.pop();
                    }
                } else if (expression[i].equals("(") ||
                        priority.get(expression[i]) >= priority.get(getTopOperator())) {

                    stack.push(expression[i]);
                } else {
                    temp = stack.pop();
                    suffixStr.append(temp).append(" ").append(expression[i]).append(" ");
                }

            }
        } catch (Exception e) {
            throw e;
        }
        while (stack.size() > 0) {
            suffixStr.append(stack.pop());
        }

        return suffixStr.toString();
    }

}

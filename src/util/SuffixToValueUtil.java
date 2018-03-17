package util;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class SuffixToValueUtil {

    public static void main(String[] args) {
        //System.out.println(compute("30 11 25 - * 11 /"));
        System.out.println(isNum("12"));
    }

    private static Pattern pattern = Pattern.compile("\\d+\\.?\\d?");

    public static boolean isNum(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static int compute(String expression) throws Exception {
        int numOne, numTwo;
        String temp = "";
        String[] express = expression.split(" ");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < express.length; i++){
            if (isNum(express[i])){
                stack.push(express[i]);
            }
            else
            {
                numTwo = Integer.parseInt(stack.pop());
                numOne = Integer.parseInt(stack.pop());
                temp = CalculateUtil.compute(numOne, numTwo, express[i]).toString();

                if (Integer.parseInt(temp) < 0){
                    throw new Exception("Negative numbers in operation");
                }
                stack.push(temp);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}

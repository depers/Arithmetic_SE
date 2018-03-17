package util;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class CalculateUtil {

    public static void main(String[] args) {
        System.out.println(compute(1,2, "+"));
    }

    public static Integer compute(int firstNum, int secNum, String operator){

        switch (operator){
            case Const.Operator.add:{
                return firstNum + secNum;
            }
            case Const.Operator.subtraction:{
                return firstNum - secNum;
            }
            case Const.Operator.multiplication:{
                return firstNum * secNum;
            }
            case Const.Operator.division:{
                return firstNum / secNum;
            }
            default:{
                return null;
            }
        }
    }
}

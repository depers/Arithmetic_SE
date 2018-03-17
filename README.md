# Arithmetic_Software Engineering


> 该项目是本科大三下学期《软件工程》课程项目“实验二 软件工程个人项目——包含3到5个数字的四则运算练习的命令行软件开发”。

## 主要需求

* 程序可接收一个输入参数n，然后随机产生n道加减乘除练习题，每个数字在 0 和 100 之间，运算符在3个到5个之间。
* 为了让小学生得到充分锻炼，每个练习题至少要包含2种运算符。同时，由于小学生没有分数与负数的概念，你所出的练习题在运算过程中不得出现负数与非整数，比如不能出 3/5+2=2.6，2-5+10=7等算式。
* 练习题生成好后，将你的学号与生成的n道练习题及其对应的正确答案输出到文件“result.txt”中，不要输出额外信息，文件目录与程序目录一致。
* 当程序接收的参数为4时，以下为输出文件示例。
* 支持有括号的运算式，包括出题与求解正确答案。注意，算式中存在的括号必须大于2个，且不得超过运算符的个数。
> 201571030107  
  72*(50+(42+44)) = 9792  
  (17+54)-(73/99) = 71  
  (97\*91)+(20/32) = 8827  
  12*(55*(95/40)) = 1320
  
## 组织结构
```
Arithmetic(SE)
|--app
|   |--Arithmetic
|   |--BracketsCompute
|--util
|   |--CalculateUtil
|   |--Const
|   |--FileUtil
|   |--RandomUtil
|   |--InfixToSufixUtil
|   |--SufixToValueUtil
|--Application
```
## 编译运行

在命令行中运行run.bat文件，所有java文件自动编译运行

## 参考博文
[Java 用栈处理四则运算](http://blog.csdn.net/kinglearnjava/article/details/48786829)   
[使用javac命令行编译一个目录下的所有.java文件](http://blog.csdn.net/u013349237/article/details/72453366)
:thumbsup::thumbsup::thumbsup:
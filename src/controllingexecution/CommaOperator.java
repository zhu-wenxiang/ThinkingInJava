package controllingexecution;

public class CommaOperator {

    public static void main(String[] args) {
        for (int i = 0, c = 'c'; i < 10; i++) {
            //输出的值是99，尽管给c赋值的是字符型，但是转成了int了
            System.out.println(c);
        }
    }
}
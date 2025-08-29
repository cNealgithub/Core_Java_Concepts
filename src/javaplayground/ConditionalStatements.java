package javaplayground;

public class ConditionalStatements {

    public static void main(String args[]) {
        //<------------Conditional Statements------------>
        int x = 55;
        int y = 78;
        //Comparing Two Inegers(if-else)
        if (x > y) {
            System.out.println(x + " is the greatest integer");
        } else {
            System.out.println(y + " is the greatest integer");
        }
        //comparing more than two integers
        System.out.println("---------------------------------------------------");
        int a = 2;
        int b = 88;
        int c = 55;
        if (a > b && a > c) {
            System.out.println(a + " is the greatest integer");
        } else if (b > a && b > c) {
            System.out.println(b + " is the graatest integer");
        } else {
            System.out.println(c + " is the greatest integer");
        }
        System.out.println("---------------Ternary Operator(?:)----------------");
        int u = 45;
        int result = u%2 == 0? 10 : 20;
        System.out.println("result:"+result);
    }
}

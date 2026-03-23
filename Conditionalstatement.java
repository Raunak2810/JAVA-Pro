import java .util.Scanner;
public class Conditionalstatement {
    public static void main(String[] args){
        int num1 =5;
        int num2=10;
        int num3=15;
        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is greatest" +num1);

        }else if(num2>num1 && num2>num3)
        {
            System.out.println("num2 is greatest" +num2);
        }else
        {
            System.out.println("num3 is greatest" +num3);
        }
    }
}
// switch case example

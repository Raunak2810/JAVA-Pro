// calculator 
import java.util.Scanner;
public interface Cal{
    public static void main(String[] args) {
        public int sum(int num1, int num2);
        public int sub(int num1, int num2);
        public int mul(int num1, int num2);
        public int div(int num1, int num2);         
    }
}
public class calimpl implements Cal{
    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int sub(int num1, int num2){
        return num1-num2;
    }
    public int mul(int num1, int num2){
        return num1*num2;
    }
    public int div(int num1, int num2){
        return num1/num2;
    }
}
public class main{
    public static void main(String[] args) {
        calimpl c = new calimpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Sum : "+c.sum(num1, num2));
        System.out.println("Sub : "+c.sub(num1, num2));
        System.out.println("Mul : "+c.mul(num1, num2));
        System.out.println("Div : "+c.div(num1, num2));
    }
}
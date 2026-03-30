public static void main (string[] args){
    Scanner Scanner = new Scanner(System.in)
    try{
        system.out.print("enter num1: ");
        int num1 = Scanner.nextline();
        system.out.print("enter num2: ");
        int num2 = Scanner.nextline();
        int ans = num1/num2;
        system.out.println("num1/num2 = : " +ans);

    }catch (InputmismatchException i){
        system.out.println("catch");

    }
    finally{
        system.out.println("finally");
        
    }
}
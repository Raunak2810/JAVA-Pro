public class Whileloop {
    public static void main(String[] args){
        int num=5;
        boolean bol=true;
        while(bol){
            System.out.println(num);
            num--;
            if(num==0){
                bol=false;
            }
        }
    }
}
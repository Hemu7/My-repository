import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number");
       String  ans=number();
       System.out.println(ans);
    }
   /* static void number() {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        if (x%2==0){
          System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }*/
    static String number(){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if (x%2==0){
            String msg="even";
            return msg;
        }
        else {
            String msg="odd";
            return msg;
        }
    }
}
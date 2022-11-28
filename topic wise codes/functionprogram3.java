import java.util.Scanner;
public class functionprogram3 {
    public static void main(String[] args) {
        age();
    }

    static void age() {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if(x<18){
            System.out.println("no vote");
        }
        else{
            System.out.println("vote");
        }
    }
}

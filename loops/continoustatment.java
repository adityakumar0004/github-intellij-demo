package loops;
import java.util.Scanner;
public class continoustatment {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for (int i=1; i<=100;i++ ){
            System.out.println("hello");
            if(i%2 ==1) continue;
            System.out.println(i);

        }
    }
}

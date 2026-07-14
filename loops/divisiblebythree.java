package loops;
import java.util.Scanner;
public class divisiblebythree {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        for (int i=3;i<=n;i=i+3){
            System.out.println(i);
        }
    }
}

package loops;
import java.util.Scanner;
public class wapGp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = 1, r=2;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a+"");
            a*=r;

        }
    }
}

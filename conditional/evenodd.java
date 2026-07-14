package conditional;
import java.util.Scanner;
public class evenodd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("it is even");
        }
        if(n % 2 != 0) {
            System.out.println("it is odd");


        }
    }
}

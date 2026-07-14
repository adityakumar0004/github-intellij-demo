package conditional;
import java.util.Scanner;
public class numberisdivisibleby3and5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n%5==0 && n%3!=0){
            System.out.println("divisible by 5 but not 3");
        }
        else if (n%5!=0 && n%3==0) {
            System.out.println("divisible by 3 but not 5");

        }
        else if (n%5==0 && n%3==0) {
            System.out.println("it is divisible by 3 and 5");

        }
        else {

        System.out.println("it is not divisible");
        }
    }
}

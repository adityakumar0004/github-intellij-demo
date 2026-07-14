package conditional;
import java.util.Scanner;
public class threedigitornot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if (n>99&&n<1000){
            System.out.println("this is 3 digit number");
        }
        else{
            System.out.println("it is not 3 digit number");
        }

    }
}

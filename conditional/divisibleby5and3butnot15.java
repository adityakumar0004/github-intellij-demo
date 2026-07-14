package conditional;
import java.util.Scanner;
public class divisibleby5and3butnot15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n%3==0 && n%5==0){
            System.out.println("it is divisible by 3 and 5");
        }
        else if ((n%3==0||n%15!=0) && n%5!=0){
            System.out.println("condition is true");
        }
        else{
            System.out.println("condition false");

        }


    }
}

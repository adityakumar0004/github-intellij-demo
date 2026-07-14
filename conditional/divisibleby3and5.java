package conditional;
import java.util.Scanner;
public class divisibleby3and5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n  = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("the number is divisible by 5 and 3");
        }
        else{
            System.out.println("the number is not divisible");
        }
    }
}

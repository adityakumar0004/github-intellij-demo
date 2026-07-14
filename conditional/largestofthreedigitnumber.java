package conditional;
import java.util.Scanner;
public class largestofthreedigitnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a os largest");
        }
        else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else{
            System.out.println(" c is largest");

        }

    }
}

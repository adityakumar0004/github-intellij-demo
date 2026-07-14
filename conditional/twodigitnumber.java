package conditional;
import java.util.Scanner;
public class twodigitnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if(n>9&&n<99){
            System.out.println("this is 2 digit");
        }
        else{
            System.out.println("this is not 2 digit");
        }

    }
}

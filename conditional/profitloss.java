package conditional;
import java.util.Scanner;
public class profitloss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price ");
        int cp = sc.nextInt();
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("your profit is : ");
            int profit = sp-cp;
            System.out.println(profit);
        }
        else{
            System.out.println("your loss is : ");
            int loss = cp-sp;
            System.out.println(loss);
        }

    }
}

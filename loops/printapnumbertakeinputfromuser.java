package loops;
import java.util.Scanner;
public class printapnumbertakeinputfromuser {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the AP  number");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1;i+=2){
            System.out.println(i);
        }
    }
}

package loops;
import java.util.Scanner;
public class prime {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2;i < n;i++){
            if(n%i==0){
                flag = true;
                break;

            }

        }
        if(n==1){
            System.out.println("nither prime nor composit");
        }
        else if (!flag) {
            System.out.println("prime number");

        }
        else{
            System.out.println("composit number");
        }

    }
}

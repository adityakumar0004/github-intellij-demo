package conditional;
import java.util.Scanner;
public class yearisleapyearornot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int n = sc.nextInt();
        if(n%400==0){
            System.out.println("the year is leap year");
        }
        else if (n%100==0) {
            System.out.println("the year is leap year");
        }
        else if (n%4==0) {
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not leap year");
        }

    }
}

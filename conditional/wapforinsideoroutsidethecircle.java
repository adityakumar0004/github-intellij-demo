package conditional;
import java.util.Scanner;
public class wapforinsideoroutsidethecircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of x ");
        int x = sc.nextInt();
        System.out.println("enter length of y ");
        int y = sc.nextInt();
        System.out.println("enter length of r");
        int r = sc.nextInt();
        if(x>r){
            System.out.println("out side the circle");
        }
        else if (y>x) {
            System.out.println("out side the circle");

        }
        else if (x<r) {
            System.out.println("inside the circle");

        }
        else if (y<r) {
            System.out.println("inside the circle");

        }
        else if (x==r && y==r){
            System.out.println("on the circumference");

        }


    }
}

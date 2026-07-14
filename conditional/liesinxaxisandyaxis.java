package conditional;
import java.util.Scanner;
public class liesinxaxisandyaxis {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x axis");
        int x = sc.nextInt();
        System.out.println("enter y axis");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("the point is origin");
        }
        else if (x==0) {
            System.out.println("the point lie on y axis");

        }
        else if(y==0){
            System.out.println("the point lie o x axis");
        }
        else {
            System.out.println("condition not match0");
        }
    }
}

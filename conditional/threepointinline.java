package conditional;
import java.util.Scanner;
public class threepointinline {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  x1 = 5, x2 = 10, x3 =7, y1 = 2, y2 =8, y3 = 15;
        double m1 = (y2-y1)/(x2-x1);
        double m2 =(y3-y2)/(x3-x2);
        if (m1==m2){
            System.out.println("point lie in same line");
        }
        else {
            System.out.println("they dont lie in single line");
        }
    }
}

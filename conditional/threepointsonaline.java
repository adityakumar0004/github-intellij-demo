package conditional;
import java.util.Scanner;
public class threepointsonaline {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 2, x2 = 3, x3 = 5, y1 = 1, y2 = 6, y3 = 4;
        double m1 =(y2 - y1)/(x2-x1);
        double m2 =(y3-y2)/(x3-x2);
        if (m1==m2){
            System.out.println("the point lie in single line");
        }
        else{
            System.out.println("they don't lie on the same line");
            
        }
    }
}

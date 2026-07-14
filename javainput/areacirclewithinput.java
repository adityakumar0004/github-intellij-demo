package javainput;
import java.util.Scanner;
public class areacirclewithinput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter redius");
        int radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("the area of the circle is :" +area) ;




    }

}

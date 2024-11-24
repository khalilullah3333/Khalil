
package tringalarea;


import java.util.Scanner;

public class TringalArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter cao");
        
        double x_1 = input.nextDouble();
        double y_1 = input.nextDouble();
        double x_2 = input.nextDouble();
        double y_2 = input.nextDouble();
        double x_3 = input.nextDouble();
        double y_3 = input.nextDouble();
        
        double a =Math.sqrt((Math.pow((x_2 - x_1), 2))+ (Math.pow((y_2 -y_1), 2)));
        double b =Math.sqrt((Math.pow((x_3 - x_2), 2))+ (Math.pow((y_3 -y_2), 2)));
        double c =Math.sqrt((Math.pow((x_3 - x_1), 2))+ (Math.pow((y_3 -y_1), 2)));
        double A,B,C;
        A= Math.acos((a*a-b*b-c*c)/(-2*b*c));
        B=Math.acos((b*b-a*a-c*c)/(-2*a*c));
        C=Math.acos((c*c-b*b-a*a)/(-2*a*b));
        
        System.out.println(Math.toDegrees(A));
        System.out.println(Math.toDegrees(B));
        System.out.println(Math.toDegrees(C));
        
        
    }
}

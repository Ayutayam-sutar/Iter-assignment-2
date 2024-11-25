import java.util.*;
public class question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your first point");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter your second point");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        System.out.println("Enter your third point");
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
double side1=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));

double side2=((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1));

double side3=((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2));

double s=(Math.sqrt(side1)+Math.sqrt(side2)+Math.sqrt(side3))/2.0;

double area=Math.sqrt(s*(s-Math.sqrt(side1))*(s-Math.sqrt(side2))*(s-Math.sqrt(side3)));
System.out.println("The area of triangle is "+area);
sc.close();


    }
}

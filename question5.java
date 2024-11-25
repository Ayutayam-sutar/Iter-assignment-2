import java.util.Scanner;

public class question5 {
    public static void main (String[]args){
        System.out.println("ENTER A RADIUS OF HEMISPHERE ");
    Scanner sc=new Scanner (System.in);
    double rad =sc.nextDouble();
    double sa= 3*Math.PI*rad*rad; 
double vol=2*Math.PI*rad*rad*rad/3;
System.out.println("The surface area of hemisphere of the given radius is "+sa);
System.out.println("The volume of hemisphere of the given radius is "+vol);
sc.close();
}
}
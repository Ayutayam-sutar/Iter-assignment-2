import java.util.Scanner;

public class question6 {
    public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the number in seconds ");
double time =sc.nextDouble();
double g=32.174;
double distance=1*g*time*time/2;
System.out.println("The the distance travelled is "+distance+" ft");

sc.close();


}}

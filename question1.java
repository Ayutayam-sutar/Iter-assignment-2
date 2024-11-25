import java.util.*;
public class question1 {
public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter a degree in fahrenheit");
  double f=sc.nextDouble();
    double c=(f-32)*(5.0/9) ;
  System.out.println("Fahrenheit in degree = "+f+","+"Celsius in degree = "+c);
  sc.close();
}
}
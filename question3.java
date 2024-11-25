import java.util.Scanner;

public class question3 {
    public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your basic salary");
  int basic=sc.nextInt();
   float da=(int)40.0*basic/100;
  float hra=(int)20.0*basic/100;
  float gross=hra+da+basic;
  System.out.println("Basic salary : "+basic);
  System.out.println("DA : "+da);
  System.out.println("HRA : "+hra);
  System.out.println("Gross salary : "+gross);
  sc.close();
    }
}

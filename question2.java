import java.util.Scanner;

public class question2 {
    public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the distance between two cities in kilometer");
   int km=sc.nextInt();
   int m=km*1000;
   double f=km*3280.8399;
   double in=km*39370.0787;
   float cm= km*100000;
   System.out.println(km+" km is "+m+" meters");
   System.out.println(km+" km is "+f+" feet");
   System.out.println(km+" km is "+in+" inch");
   System.out.println(km+" km is "+cm+" centimetres");
   sc.close();
}
}

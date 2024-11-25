import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        System.out.println("Enter the eggs you have" );
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); 
        int g=n/144;
        int h=n%144;
        int dozen=h/12;
        int leftover=h%12;   
        System.out.println("Gross of eggs: "+g );  
        System.out.println("Dozen of eggs: "+dozen);  
        System.out.println("Leftover of eggs: "+leftover);
        sc.close();
    }
}

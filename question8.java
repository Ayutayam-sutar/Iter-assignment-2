import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        System.out.println("Enter number in minutes");
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int   years=min/525600;
        int left=min%525600;
        int  days =left/1440;
        System.out.println(min+" minutes is approximately "+years+" years "+days+" days");
        sc.close();
    }
}

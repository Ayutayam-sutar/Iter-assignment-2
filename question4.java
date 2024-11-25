import java.util.Scanner;

public class question4 {
    public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
System.out.println("Enter a number between 0 to 1000");
int a=sc.nextInt();
int b=a%10;
int c=a/10;
int d=c%10;
int e=c/10;
int aw=e%10;
int as=e/10;
int ad=as%10;
int af=as/10;
int sum=b+d+aw+ad+af;
System.out.println("The sum of the digits is "+sum);


sc.close();


  
}}

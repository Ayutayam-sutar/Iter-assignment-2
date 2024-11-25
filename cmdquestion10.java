class cmdq10{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int a=n%10;
int next=n/1000;
int next1=next%10;
int sum=a+next1;
System.out.println("The sum of first and last digit of number is "+sum);
}}
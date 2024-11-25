class cmdq5 {
public static void main(String args[]){ 
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int z=Integer.parseInt(args[2]);
int max=Math.max(Math.max(x,y),z);
int min=Math.min(Math.min(x,y),z);
int mid=(x+y+z)-(max+min);
System.out.println("The ascending order "+min+","+mid+","+max);
}}





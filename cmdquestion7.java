public class cmdq7 {
public static void main(String args[]){ 
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int z=Integer.parseInt(args[2]);
// if(x<=y*z){
// System.out.println("true");
// }else if(z<=y*x){
// System.out.println("true");
// }else if (y<=z*x){

// System.out.println("true");
// }else{
// System.out.println("False");
// } 
boolean n=(x<=y*z||y<=x*z||z<=y*x);
System.out.println(n);
   }
    }


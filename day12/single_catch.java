import java.util.*;
public class single_catch{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
try{
c=a/b;
System.out.println(c);
}catch(ArithmeticException e){
System.out.println("can not divide by zero");
}
System.out.println("end");
}
}
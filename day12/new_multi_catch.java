import java.util.*;
public class new_multi_catch{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);

try{
a=sc.nextInt();
b=sc.nextInt();

c=a/b;
System.out.println(c);

}catch(ArithmeticException|InputMismatchException e){
if(e instanceof ArithmeticException){
System.out.println("can not divide by zero");
}else if(e instanceof InputMismatchException){
System.out.println("plz enter int value");
}
}
System.out.println("end");
}
}
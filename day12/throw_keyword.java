import java.util.*;
public class throw_key{

static int div(int x,int y){
int z=0;

try{
z=x/y;
}catch(ArithmeticException e){
throw e;
}
reyturn z;
}
public static void main(String args[]){
int a;
try{
a=div(10,0);
System.out.println(a);
}catch(Exception e){
System.out.println("recaught in main");
}
}
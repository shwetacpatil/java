import java.util.*;
//finally back
class string_handling{
static void div1(){
try{
int a;
a=10/0;
}catch(ArithmeticException e){
System.out.println("can not divide by zero");
}finally{
System.out.println("always executed");
}
}
static void div2(){
try{
int a;
a=10/2;
}catch(ArithmeticException e){
System.out.println("can not divide by zero");
}finally{
System.out.println("always executed");
}
}
static void div3(){
try{
return;
}catch(ArithmeticException e){
System.out.println("can not divide by zero");
}finally{
System.out.println("always executed");
}
}
public static void main(String args[]){
div1();
System.out.println("*********");
div2();
System.out.println("*********");
div3();
System.out.println("*********");

}
}
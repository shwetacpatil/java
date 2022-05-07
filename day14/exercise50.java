/*Write a Program with a division method who receives two integer numbers and performs the division operation. The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
throws*/

import java.util.*;
class exercise50{
static int display(int x,int y){
int z;
try{
z=x/y;
}catch(ArithmeticException e){
 throw e;
}
return z;
}

public static void main(String args[]){
int x;
try{
x=display(10,2);
System.out.println(x);
}catch(Exception e){
System.out.println("recaugth in main function");
}

}
}
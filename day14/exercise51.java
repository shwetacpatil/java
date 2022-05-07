/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program. In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
Exception Handling: Throw & Used Defined Exception*/

import java.util.*;
class exercise51{
static void display(){
try{
float m1,m2,m3;
String name;
Scanner sc=new Scanner(System.in);
name=sc.next();
m1=sc.nextFloat();
m2=sc.nextFloat();
m3=sc.nextFloat();
float avg;
avg=(m1+m2+m3)/3;
System.out.println(name);
System.out.println(avg);
}catch(InputMismatchException e){
System.out.println("enetr proper no");
}
}

public static void main(String args[]){

display();

}
}

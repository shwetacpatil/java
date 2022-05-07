/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string length will be at least 2.*/

import java.util.*;
class exercise55{
public static void main(String args[]){
String s1,ch;
int l;
Scanner sc=new Scanner(System.in);
s1=sc.next();
l=s1.length();

if(l>2){
ch=s1.substring(1,l-1);
System.out.println(ch);
}else{
System.out.println("pls insert proper input");
}

}
}
/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer 
string on the inside. The strings will not be the same length, but they may be empty (length 0). If input is "hi" and "hello", 
then output will be "hihellohi".*/

import java.util.*;
class exercise55{
public static void main(String args[]){
String s1,s2,ch;
int l,b;
Scanner sc=new Scanner(System.in);
s1=sc.next();
s2=sc.next();
l=s1.length();
b=s2.length();

if(l<b){
System.out.println(s1+s2+s1);
}else{
System.out.println(s2+s1+s2);
}

}
}



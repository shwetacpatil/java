/*Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".*/
import java.util.*;
class exercise54{
public static void main(String args[]){
String s1,ch;
int l;
Scanner sc=new Scanner(System.in);
s1=sc.next();
l=s1.length();
ch=s1.substring(0,2);
System.out.println(ch.repeat(l));

}

}
/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the string length is odd number then return null.*/

import java.util.*;
class exercise55{
public static void main(String args[]){
String s1,ch;
int l;
Scanner sc=new Scanner(System.in);
s1=sc.next();
l=s1.length();

if(l%2==0){
ch=s1.substring(0,(l/2));
System.out.println(ch);
}else{
System.out.println("NULL");
}

}
}
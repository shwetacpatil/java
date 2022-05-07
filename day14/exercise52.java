/*Write a Program that will check whether a given String is Palindrome or not*/
import java.util.*;
class exercise52{
public static void main(String args[]){
int flag=1;
String s;
Scanner sc=new Scanner(System.in);
s=sc.next();
for(int i=0;i<s.length();i++){
if(s.charAt(i)!=s.charAt(s.length()-1-i)){
flag=0;
break;
}
}
if(flag==1){
System.out.println("palindrome no");
}else{
System.out.println("non palindrome no");
}

}
}
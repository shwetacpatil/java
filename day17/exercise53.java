/*Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, 
then omit one of the chars. If the inputs are “Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)*/
import java.util.*;
class exercise53{
public static void main(String args[]){
String s1,s2,s3;
Scanner sc=new Scanner(System.in);
s1=sc.next();
s2=sc.next();
if(s1.charAt(s1.length()-1)==s2.charAt(0)){
//charRemoveAt(s2,0);
s2=s2.substring(1,s2.length());
s3=s1.concat(s2);
System.out.println(s3);
}else{
s3=s1.concat(s2);
System.out.println(s3);
}

}

}
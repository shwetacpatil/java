public class substring{
public static void main(String args[]){
String s1="hellow world";
String s2=s1.substring(2);
System.out.println(s2);
s2=s1.substring(2,8);
System.out.println(s2);

System.out.println(s1.startsWith("hi"));
System.out.println(s1.startsWith("hello"));
System.out.println(s1.endsWith("hello"));
System.out.println(s1.endsWith("ld"));
System.out.println(s1.endsWith("wor"));
}
}
import java.util.*;
class vowel_consonant{
public static void main(String arg[]){
String s;
char a;
Scanner sc=new Scanner(System.in);
s=sc.next();
a=s.charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
System.out.println("vowel");
}else{
System.out.println("consonant");
}
}
}
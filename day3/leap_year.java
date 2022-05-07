import java.util.*;
class leap_year{
public static void main(String arg[]){
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a%100==0 && a%4==0){
System.out.println("leap year");
}else{
System.out.println("not leap year");
}
}
}
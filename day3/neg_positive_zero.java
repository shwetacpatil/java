import java.util.*;
class neg_positive_zero{
public static void main(String arg[]){
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a>0){
System.out.println("no is positive");
}else if(a<0){
System.out.println("no is negative");
}else{
System.out.println("its zero");
}
}
}
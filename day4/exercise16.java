import java.util.*;
class exercise15{
public static void main(String arg[])
{
int a,sum=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();

for(int i=0;i<=a;i++){
 sum+=i;
}
System.out.println("sum of numbers:"+sum);
}
}
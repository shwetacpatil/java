import java.util.*;
class seperate_digitadd
{
public static void main(String arg[])
{
int num,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number ");
num=sc.nextInt();
while(num!=0)
{
sum+=num%10;
num=num/10;
}
System.out.println("sum is "+sum);
}
} 
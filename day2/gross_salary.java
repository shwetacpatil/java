import java.util.*;
class gross_salary
{
public static void main(String arg[])
{
float sal,gsal;
Scanner sc=new Scanner(System.in);
System.out.println("enter salary ");
sal=sc.nextFloat();
gsal=sal+sal*0.2f+sal*0.8f;
System.out.println("gross salary is "+gsal);
}
} 
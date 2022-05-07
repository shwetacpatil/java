import java.util.*;
class feet_inch
{
public static void main(String arg[])
{
double feet,inches,meter;
Scanner sc=new Scanner(System.in);
System.out.println("enter meter ");
meter=sc.nextDouble();
feet=meter*3.28084;
inches=meter*39.37;
System.out.println("feet is "+feet);
System.out.println("inches is "+inches);
}
} 
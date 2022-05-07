import java.util.*;
class exercise9{
public static void main(String arg[])
{
double eff,Tair,Tsteam;
Scanner sc=new Scanner(System.in);
System.out.println("enter temprature of air and steam");
Tair=sc.nextDouble();
Tsteam=sc.nextDouble();
eff=1-(Tair/Tsteam);
if(Tair>300 && Tsteam>373)
{
System.out.println(eff);
}else{
System.out.println("efficiency is zero");
}

}
}
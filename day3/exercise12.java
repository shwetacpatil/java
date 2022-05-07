import java.util.*;
class exercise12{
public static void main(String arg[])
{
int strength,health,luck,total;
Scanner sc=new Scanner(System.in);
System.out.println("enter strength , health and luck point  ");
strength=sc.nextInt();
health=sc.nextInt();
luck=sc.nextInt();
total=strength+health+luck;
if(total<15){

System.out.println("strength is "+strength);
System.out.println("health is "+ health);
System.out.println("luck is " +luck);

}else{
strength=5;
health=5;
luck=5;

System.out.println("strength is "+strength);
System.out.println("health is "+ health);
System.out.println("luck is " +luck);
}

}
}
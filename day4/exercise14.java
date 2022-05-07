import java.util.*;
class exercise14{
public static void main(String arg[])
{
int bolt,nuts,washers;
Scanner sc=new Scanner(System.in);
System.out.println("enter bolts nuts washers  ");
bolt=sc.nextInt();
nuts=sc.nextInt();
washers=sc.nextInt();

if(bolt==nuts && washers>=2*bolt){

System.out.println("all is ok ");
}else if(bolt>nuts && washers>=2*bolt){

System.out.println("nuts are few ");
}
else if(bolt<nuts && washers>=2*bolt){
                                            
System.out.println("bolts are few ");
}else{

System.out.println("order has an error ");

}
int total;
total=bolt*5+nuts*3+washers;
System.out.println("total is "+total);

}
}
import java.util.*;
class exercise13{
public static void main(String arg[])
{
int dispose,charge;
Scanner sc=new Scanner(System.in);
System.out.println("enter dispose in tones  ");
dispose=sc.nextInt();

if(dispose<200){

charge=20;
System.out.println("charge is "+charge);
}else if(dispose>200){
int x;
x=dispose/100;
x=x-2;
charge=20+x*8;
System.out.println("charge is "+charge);
}

}
}
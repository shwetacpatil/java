import java.util.*;
class exercise11{
public static void main(String arg[])
{
float Theat,Nitem, min,sec;
Scanner sc=new Scanner(System.in);
System.out.println("enter heat and items ");
Theat=sc.nextInt();
Nitem=sc.nextInt();
if(Nitem==1){
sec=Theat%100;
min=Theat/100;
System.out.println("minutes :"+min);
System.out.println("second :"+sec);

}else if(Nitem==2){
Theat=Theat*1.5f;
sec=Theat%100;
min=Theat/100;
System.out.println("minutes :"+min);
System.out.println("second :"+sec);

}else if(Nitem==3){
Theat=Theat*2;
sec=Theat%100;
min=Theat/100;
System.out.println("minutes :"+min);
System.out.println("second :"+sec);

}

}
}
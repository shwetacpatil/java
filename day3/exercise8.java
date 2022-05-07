import java.util.*;
class exercise8{
public static void main(String arg[]){
double a,delivary,regular=2,express=3;
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
if(a<10){
delivary=regular+express;
System.out.println("delivary : "+delivary);
System.out.println("total : "+(delivary+a));
}else{
delivary=express;
System.out.println("delivary : "+delivary);
System.out.println("total : "+(delivary+a));
}

}
}
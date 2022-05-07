import java.util.*;
class exercise20{
public static void main(String arg[])
{
int n,i=1,x;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(i<n){

i++;
if(n%i==0){
break;
}

}
if(n==i){
System.out.println("prime");
}else{
System.out.println("non prime");
}

}
}
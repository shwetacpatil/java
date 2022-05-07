import java.util.*;
class exercise20{
public static void main(String arg[])
{
int n,m,i=100,x,y;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
while(i>0)
{
x=m/n;

if(x%n==0 || m%n==0){
    y=0;
    break;
}
i--;
System.out.println("it is not power");
}else{
System.out.println("its power");
}

break;
}


}
}
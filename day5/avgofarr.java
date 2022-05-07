import java.util.*;
class avgofarr{
public static void main(String[] arg){
int n,i,sum=0,x, avg;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];

for(i=0;i<arr.length;i++){

arr[i]=sc.nextInt();
}
x=arr.length;
for(i=0;i<arr.length;i++){
sum+=arr[i];
avg=sum/x;
}
System.out.println(avg);
}
}
import java.util.*;
class sumofarr{
public static void main(String[] arg){
int n,i,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];

for(i=0;i<arr.length;i++){

arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++){
sum+=arr[i];
}
System.out.println(sum);
}
}
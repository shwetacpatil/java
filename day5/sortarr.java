import java.util.*;
class storearray{
public static void main(String[] arg){
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];

for(i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length-1;i++){
for(int j=1;j<arr.length;j++){
if(arr[i]>arr[j]){
int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
System.out.println(arr[i]);
}
}
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}

}
}
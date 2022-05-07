import java.util.*;
class exercise28{
public static void main(String[] arg){
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];

for(i=0;i<arr.length;i++){

arr[i]=sc.nextInt();
}
for(i=arr.length-1;i>=0;i--){

System.out.println(arr[i]);
}

}
}
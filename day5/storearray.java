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
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}

}
}

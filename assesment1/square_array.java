import java.util.*;

class square_array{
public static void main(String args[]){
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<arr.length;i++){
arr[i]=arr[i]*arr[i];
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
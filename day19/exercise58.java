import java.util.*;
public class exercise58{
public static void main(String args[]){
ArrayList<Integer> ar;
ar=new ArrayList<>();

ArrayList<Integer> ar1;
ar1=new ArrayList<>();
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
for(int i=2;i<n;i++){
if(i%2==0){
ar.add(i);
}else{
continue;
}
}
System.out.println(ar);
for(int i=2;i<n;i++){
if(i%2==0){
ar1.add(i*2);
}else{
continue;
}
}
System.out.println(ar1);
}

}

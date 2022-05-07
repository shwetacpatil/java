import java.util.*;
class exercise25{
public static void main(String[] arg){
int i;
Scanner sc=new Scanner(System.in);
//n=sc.nextInt();
int valA[]={13,-22,82,17};
int valB[]={-12,24,-79,-13};
int sum[]={0,0,0,0};

for(i=0;i<4;i++){
sum[i]=valA[i]+valB[i];
}

System.out.println("array is "+sum[0]+sum[1]+sum[2]+sum[3]);


}
}
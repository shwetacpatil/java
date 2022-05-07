import java.util.*;
class exercise25{
public static void main(String[] arg){
int i;
Scanner sc=new Scanner(System.in);
//n=sc.nextInt();
int val[]=new int[4];
double twice[]=new double[4];

for(i=0;i<4;i++){
val[i]=sc.nextInt();
}

System.out.println("array is "+val[0]+val[1]+val[2]+val[3]);


for(i=0;i<4;i++){
twice[i]=val[i];
}

System.out.println("array is "+val[0]+val[1]+val[2]+val[3]);


}
}
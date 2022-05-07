import java.util.*;
class exercise25{
public static void main(String[] arg){
int i;
Scanner sc=new Scanner(System.in);
//n=sc.nextInt();
int valA[]={13,-22,82,17};

int valB[]={0,0,0,0};

for(i=0;i<4;i++){
if(valA[i]>=0){
valB[i]=25-valA[i];
}else{
valB[i]=(25+(-valA[i]));
}
}
System.out.println("array is "+valA[0]+" "+valA[1]+" "+valA[2]+" "+valA[3]);
System.out.println("array is "+valB[0]+" "+valB[1]+" "+valB[2]+" "+valB[3]);
System.out.println("array is "+(valA[0]+valB[0])+" "+(valA[1]+valB[1])+" "+(valA[2]+valB[2])+" "+(valA[3]+valB[3]));


}
}
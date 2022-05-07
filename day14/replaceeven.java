import java.util.*;
class replaceeven{
static void example(){
try{
Scanner sc=new Scanner(System.in);
int k;
k=sc.nextInt();
String s;
s=Integer.toString(k);

for(int i=0;i<s.length();i++){
if(s.charAt(i)%2==0 && i<=s.length()-4){
System.out.println(s.charAt(i+3));
}/*else if(s.charAt(i)%2==0 && i>s.length()-4){
i=3-(s.length()-1-i);
System.out.println(s.charAt(i));
}*/else{
System.out.println(s.charAt(i));
}
}
}catch(StringIndexOutOfBoundsException e){
throw e;
}
}
public static void main(String args[]){

example();

}
}
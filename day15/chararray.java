import java.io.*;
class chararray{
public static void main(String[] args)throws Exception {  
String msg="deogiri";
char[] arr=msg.toCharArray();
CharArrayReader ob;
ob=new CharArrayReader(arr);
int x;
do{ 
x=ob.read();
System.out.print((char)x);
}while(x!=-1);
System.out.println(); 
}
}

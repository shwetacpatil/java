import java.io.*;
class bytearray{
public static void main(String[] args)throws Exception {  
String msg="deogiri";
byte[] arr=msg.getBytes();
ByteArrayInputStream ob;
ob=new ByteArrayInputStream(arr);
int x;
do{ 
x=ob.read();
System.out.print((char)x);
}while(x!=-1);
System.out.println(); 
}
}
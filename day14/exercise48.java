import java.util.*;
import java.io.*;
public class exercise48{
public static void main(String args[])throws Exception{
FileInputStream test1;
test1=new FileInputStream("C:\\Users\\shwet\\OneDrive\\Desktop\\java prg\\day14\\test1.txt");
StringBuffer sb=new StringBuffer();
int x,key=0;
//System.out.println(fin.available());
do{
x=test1.read();
if(x!=-1){
key++;
}
}while(x!=-1);
System.out.println(key);
test1.close();

}
}
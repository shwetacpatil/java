import java.io.*;
public class FileReader{
public static void main(String[] args)throws Exception {
FileReader fin;
fin=new FileReader("C:\\Users\\shwet\\OneDrive\\Desktop\\java prg\\day15\\test.txt");
BufferedReader bin;
bin=new BufferedReader(fin);
String s1="";
while((s1=bin.readLine())!=null){
System.out.println(s1);
}
bin.close();
}
}

//RandomAccessFile
import java.io.*;
public class randomaccessfile {
public static void main(String[] args) throws Exception {
RandomAccessFile ob;
ob = new RandomAccessFile("C:\\Users\\shwet\\OneDrive\\Desktop\\java prg\\day15\\test.txt", "rw");

ob.seek(5);
ob.seek(0);
int x;
do {
x = ob.read();
if (x != -1) {
System.out.print((char) x);
}
} while (x != -1);
ob.close();
System.out.println();

    }
}

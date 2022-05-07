/*This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.
Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed
Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 9 java.lang.ArrayIndexOutOfBoundsException
Sample Input and Output 3: Enter the number of elements in the array 2 Enter the elements in the array 30 j java.lang.NumberFormatException
Exception Handling: Try-catch Use multiple catch block*/

import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
class exercise47{
static void display(){
try{
Scanner sc=new Scanner(System.in);
int n,key;
key=sc.nextInt();
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println(arr[key]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("enter correct array");
}
}
public static void main(String args[]){
display();
}

}
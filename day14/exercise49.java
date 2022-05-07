/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.
Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed
Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 9 java.lang.ArrayIndexOutOfBoundsException
Sample Input and Output 3: Enter the number of elements in the array 2 Enter the elements in the array 30 j java.lang.NumberFormatException
Exception Handling: Try-catch Use multiple catch block*/

import java.util.*;
class exercise49{
static int display(int a){
try{
int sum=0;
int avg;
Scanner sc=new Scanner(System.in);
//a=sc.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++){
sum+=arr[i];
}
avg=sum/a;
}catch(ArithmeticException e){
 throw e;
}
return avg;
}

public static void main(String args[]){
int x;
x=display(5);

}
}

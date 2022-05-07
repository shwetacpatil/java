import java.util.*;
interface LibraryUser{
abstract void registerAccount(int age);
abstract void requestBook();
}
class KidUsers implements LibraryUser{
@Override
void registerAccount(int age){
if(age<12){
System.out.println("you have successfully resistered under a kids account");
}else{
System.out.println("sorry,Age must be less than 12 years");
}
}
@Override
void requestBook(String bookType){
if(bookType=="kids"){
System.out.println("book issued successfully,please return the book within 10 days");
}else{
System.out.println("you are allowed to take only kids books");
}
}

}
class AdultUsers implements LibraryUser{ 
@Override
void registerAccount(int age){
if(age>12){
System.out.println("you have successfully resistered under a kids account");
}else{
System.out.println("sorry,Age must be more than 12 years");
}
}
@Override
void requestBook(String bookType){
if(bookType=="friction"){
System.out.println("book issued successfully,please return the book within 7 days");
}else{
System.out.println("you are allowed to take only friction books");
}
}

}
public class exercise43{

public static void main(String args[]){
LibraryUser l1;
int age;
String bookType;
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
bookType=sc.next();

if(age<12){
l1=new KidUsers();

l1.registerAccount(age);
l1.requestBook(bookType);
}else{
l1=new AdultUsers();

l1.registerAccount(age);
l1.requestBook(bookType);
}
}

}
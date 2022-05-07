abstract class student{
void getstudentInfo(){
System.out.println("Get student information");
}
abstract void yearOfAdmission();
}
class First extends student {
@Override
void yearOfAdmission(){
System.out.println("welcome in first year");
}
}
class Second extends student{
@Override
void yearOfAdmission(){
System.out.println("welcome in second year");
}
}
class Third extends student{
@Override
void yearOfAdmission(){
System.out.println("welcome in third year");
}
}
class FinalYear extends student{
@Override
void yearOfAdmission(){
System.out.println("welcome in final year");
}
}
class studentFactory{
public static student getAccount(String type){
student obj=null;
if (type.equalsIgnoreCase("First")){
obj=new First();
}else if(type.equalsIgnoreCase("Second")){
obj=new Second();
}else if(type.equalsIgnoreCase("Third")){
obj=new Third();
}else if(type.equalsIgnoreCase("FinalYear")){
obj=new FinalYear();
}else{
System.out.println("please enter valid proper year");
}
return obj;
}
}
public class factory_pattern2{
public static void main(String[] args){
student ob1=studentFactory.getAccount("First");
ob1.yearOfAdmission();
ob1=studentFactory.getAccount("Second");
ob1.yearOfAdmission();
ob1=studentFactory.getAccount("Third");
ob1.yearOfAdmission();
ob1=studentFactory.getAccount("FinalYear");
ob1.yearOfAdmission();
}
}
class Person{
String name;
int age;

String getName(String name1){
name=name1;
}
int getAge(int age1){
age=age1;
}

}
class Student{
int id;
int standard;
float marks;
int getId(int id1){
id=id1;
}
int getStandard(int standard1){
standard=standard1;
}
float getMarks(float marks1){
marks=marks1;
}


}
class Teacher extends Person{
double salary;
String subject;
double getSalary(double salary1){
salary=salary1;
}
String getsubject(String subject1){
subject=subject1;
}
void displayTeacher(){
System.out.println(name);
System.out.println(age);
System.out.println(salary);
System.out.println(subject);

}
}
class Collegestud extends Student{
int year;
String major;
int getyear(int year){
year=year;
}
String getmajor(String major1){
major=major1;
}
void displayCollegestud(){
System.out.println(id);
System.out.println(standard);
System.out.println(marks);
System.out.println(year);
System.out.println(major);

}
}
public class exercise37{
public static void main(String args[]){
Teacher ob=new Teacher();
ob.getName("shweta");
ob.getAge(22);
ob.getSalary(1111.11);
ob.getsubject("maths");
ob.displayTeacher();

Collegestud ob1=new Collegestud();
ob1.getId(42151);
ob1. getStandard(123);
ob1.getMarks(9.21f);
ob1.getmajor("civil");
ob1.displayCollegestud();

}

}
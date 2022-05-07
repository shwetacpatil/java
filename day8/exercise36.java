class Person{
String name;

String personName(String name1){

name=name1;

}
}
class Employee extends Person{
double salary;
int year;
String national_insu_no;

doubl yeeSalary(double1){
salary=salary1;
}
int employeeYear(int year1){
year=year1;
}
String employeeNum(String national_insu_no1){
national_insu_no=national_insu_no1;
}
void display(){
System.out.println(name);
System.out.println(salary);
System.out.println(year);
System.out.println(national_insu_no);
}
}

public class exercise36{
public static void main(String args[]){
Employee ob=new Employee();
ob.personName("shweta");
ob.employeeSalary(11111.11);
ob.employeeYear(2022);
ob.employeeNum("1234567890");
ob.display();
}

}
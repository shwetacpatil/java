class person{
public String First_name;
public String Last_name;

public String setFirst_name(String First_name){
this.First_name=First_name;
}

public String setSalary(String Last_name){
this.Last_name=Last_name;
}
public void getFirst_name(){
System.out.println(First_name);
}
public void getLast_name(){
System.out.println(Last_name);
}

}

class teacher extends person{

public double salary;
public int year;
public int experiance;


public double setSalary(double salary){
this.salary=salary;
}
public int setYear(int year){
this.year=year;
}
public int setExperiance(int experiance){
this.experiance=experiance;
}
public void getSalary(){
System.out.println(salary);
}
public void getYear(){
System.out.println(year);
}
public void getExperiance(){
System.out.println(experiance);
}

}
class persone{
public static void main(String args[]){

person p1=new person();
p1.getFirst_name("shweta");
p1.getLast_name("patil");

p1.getFirst_name();
p1.getLast_name();

teacher t1=new teacher();

t1.setSalary(2300);
t1.setYear(2022);
t1.setExperiance(3);

t1.getSalary();
t1.getYear();
t1.getExperiance();

}
}
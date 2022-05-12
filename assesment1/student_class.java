import java.util.*;

class student{
private String First_name;
private String Last_name;
private String major;
private int year;

public String setFirst_name(String First_name1){
First_name=First_name1;
}
public String setLast_name(String Last_name1){
Last_name=Last_name1;
}
public String setMajor(String major1){
major=major1;
}
public int setYear(int year1){
year=year1;
}

public void getFirst_name(){
System.out.println(First_name);
}
public void getLast_name(){
System.out.println(Last_name);
}
public void getMajor(){
System.out.println(major);
}
public void getYear(){
System.out.println(year);
}
}

class student_class{
public static void main(String args[]){

student st=new student();
st.setFirst_name("shweta");
st.setLirst_name("patil");
st.setMajor("civil");
st.setYear(2022);

student st1=new student();
st1.setFirst_name(shwetuu);
st1.setLirst_name(patill);
st1.setMajor("student");
st1.setYear(2022);

st.getFirst_name();
st.getLirst_name();
st.getMajor();
st.getYear();

st1.getFirst_name();
st1.getLirst_name();
st1.getMajor();
st1.getYear();

}
}
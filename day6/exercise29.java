class student{
    String name,last_name,major;
    int year;
       void setInfo(String x,String y,String z,int a){
          name=x;
          last_name=y;
          major=z;
          year=a;
       }
       void getInfo(){
       System.out.println(name);
        System.out.println(last_name);
         System.out.println(major);
         System.out.println(year);
       }
}
//import java.util.*;
class exercise29{
public static void main(String arg[]){
student s1=new student();
student s2=new student();
s1.setInfo("abc","xyz","engineering",2022);
s2.setInfo("ab","xy","doctor",2023);
s1.getInfo();
s2.getInfo();

}
}
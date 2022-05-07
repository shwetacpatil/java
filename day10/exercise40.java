import java.util.*;
abstract class compartment{
abstract void notice();
}
class FirstClass extends compartment{
void notice(){
System.out.println("welcome to first class");
}
}
class Ladies extends compartment{
void notice(){
System.out.println("welcome to ladies class");
}

}
class General extends compartment{
void notice(){
System.out.println("welcome to General class");
}

}
class Luggage extends compartment{
void notice(){
System.out.println("welcome to Luggage class");
}

}

public class exercise40{

public static void main(String args[]){
int i;
compartment c1;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();

switch(i){
case 1:
c1=new FirstClass();
c1.notice();
break;
case 2:
c1=new Ladies();
c1.notice();
break;
case 3:
c1=new General();
c1.notice();
break;
case 4:
c1=new Luggage();
c1.notice();
break;
default:
System.out.println("put proper input");
break;
}
}

}
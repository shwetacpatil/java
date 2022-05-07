class A {
@Override
public String toString(){
  return "this is object of A class";
}
}
class B extends A{
@Override
public String toString(){
  return "this is object of B class";
}
}
class Why_override{
public static void main(System[] args){
  A ob1=new A();
 B ob1=new B();
 System.out.println(ob1);
 System.out.println(ob2);
System.out.println(ob1.tostring());
System.out.println(ob2.tostring());

 
}

}
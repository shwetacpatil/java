class A{
int i;
A(){
i=10;
System.out.println("in a");
}
}

class B extends A{
int i;
B(){
i=20;
System.out.println("in b");
}
void add(){
System.out.println(i+i);
}
}

class address_student{
public static void main(String[] arg){
B ob=new B();
ob.add();

}
}
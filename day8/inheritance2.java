class Test{
void add(int x,int y){
System.out.println(x+y);
}
void add(float x,float y){
System.out.println(x+y);
}

}

class address_student{
public static void main(String[] arg){
Test ob=new Test();
ob.add(1.2f,1.2f);
ob.add(100,200);

}
}
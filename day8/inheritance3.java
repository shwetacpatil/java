class Test{
int i;
static int j;
Test(){
i++;
j++;
}
void disp(){
System.out.println("hello ");
}
static void show(){
//System.out.println(i);
System.out.println(j);
Test ob=new Test();
ob.disp();
}
}

class address_student{
public static void main(String[] arg){
Test ob=new Test();
ob.show();

}
}
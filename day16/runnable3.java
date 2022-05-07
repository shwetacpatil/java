class Test implements Runnable{
Thread t;
Test(String n){
 t=new Thread(this);
 t.start();
}
@Override
public void run(){
try{
for(int i=0;i<5;i++){
System.out.println("child thread"+t.getName()+":"+i);
Thread.sleep(500);
}
}catch(Exception e){

}

}

}
public class runnable3{
public static void main(String args[]){
Test t1=new Test("A");
Test t2=new Test("B");
Test t3=new Test("C");
System.out.println("child thread A"+t1.t.isAlive());
System.out.println("child thread B"+t2.t.isAlive());
System.out.println("child thread C"+t3.t.isAlive());
try{
t1.t.join();
t2.t.join();
t3.t.join();
}catch(Exception e){

}
System.out.println("child thread A"+t1.t.isAlive());
System.out.println("child thread B"+t2.t.isAlive());
System.out.println("child thread C"+t3.t.isAlive());

}

}
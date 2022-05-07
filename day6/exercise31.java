class account{
     int id;
      String name;
      float balance;
   void setInfo(int x,String y,float z){                                                                           
         id=x;
      name=y;
     balance=z;


    }
     void getInfo(){
      System.out.println(id);
      System.out.println( name);
      System.out.println(  balance);
      }
      
}
class exercise31{
public static void main(String arg[])
{
   account p1=new account();
   account p2=new account();
    p1.setInfo(1234,"abc",23000);
    p1.getInfo();
    p2.setInfo(12345,"xyz",24000 );
    p2.getInfo();

}
}
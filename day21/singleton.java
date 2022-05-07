class Sequence{
static int counter;
static Sequence obj=null;
private Sequence(){
counter=0;
}
static synchronized Sequence getInstance(){
if(obj==null){

obj=new Sequence();

System.out.println("object created");
}

counter++;
System.out.println("counter is "+counter);
return obj;
}
}

public class singleton{
public static void main(String args[]){
Sequence s=Sequence.getInstance();
Sequence s2=Sequence.getInstance();
Sequence s3=Sequence.getInstance();
Sequence s4=Sequence.getInstance();
}
}

abstract class GeneralBank{

abstract void getSavingIntrestRate(float P,float r,float n);
abstract void getFixedIntrestRate(float P,float r,float n);

}
class ICICIBank extends GeneralBank{

@Override
void getSavingIntrestRate(float P,float r,float n){
System.out.println("rate of intrest of svaing account"+P*r*n/100);
 // roi=P*r*n/100;
  //return roi;
}

@Override
void getFixedIntrestRate(float P,float r,float n){
  System.out.println("rate of intrest of fixed account"+P*r*n/100);
 // roi=P*r*n/100;
  //return roi;

}
}
class KotMBank extends GeneralBank{
@Override
void getSavingIntrestRate(float P,float r,float n){
System.out.println("rate of intrest of svaing account"+P*r*n/100);
 // roi=P*r*n/100;
  //return roi;
}

@Override
void getFixedIntrestRate(float P,float r,float n){
  System.out.println("rate of intrest of fixed account"+P*r*n/100);
 // roi=P*r*n/100;
  //return roi;

}

}
public class exercise39{

public static void main(String args[]){

ICICIBank i1=new ICICIBank();
KotMBank k1=new KotMBank();
GeneralBank g1;
g1=new ICICIBank();
System.out.println("rate of intrest of general account***");

g1.getSavingIntrestRate(1000f,4f,2f);
g1.getFixedIntrestRate(1000f,8.5f,2f);
System.out.println("rate of intrest of General account***");

g1=new KotMBank();
g1.getSavingIntrestRate(1000f,6f,2f);
g1.getFixedIntrestRate(1000f,9f,2f);
System.out.println("rate of intrest of ICICI account***");

i1.getSavingIntrestRate(1000f,4f,2f);
i1.getFixedIntrestRate(1000f,8.5f,2f);
System.out.println("rate of intrest of kotak account******");

k1.getSavingIntrestRate(1000f,6f,2f);
k1.getFixedIntrestRate(1000f,9f,2f);
}
}
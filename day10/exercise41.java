import java.util.*;
abstract class instrument{
abstract void play();
}
class Piano extends instrument{
void play(){
System.out.println("piano is playing tan tan tan");
}

}
class flute extends instrument{
void play(){
System.out.println("flute is playing toot toot toot");
}

}
class giutar extends instrument{
void play(){
System.out.println("guitar is playing tin tin tin");
}

}
public class exercise41{

public static void main(String args[]){
int i;
instrument c1;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();

switch(i){
case 1:
c1=new Piano();
c1.play();
break;
case 2:
c1=new flute();
c1.play();
break;
case 3:
c1=new giutar();
c1.play();
break;
default:
System.out.println("put proper input");
break;
}
}

}
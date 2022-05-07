import music.playable;
import music.wind.saxophone;
import music.string.veena;

public class test{

public static void main(String args[]){
playable p1;
p1=new saxophone();
p1.play();

p1=new veena();
p1.play();

}

}
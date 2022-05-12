class armstrong_no{
public static void main(String args[]){
int a,b;
int x,y,z,w;

int k;

for(a=100;a<=999;a++){
x=a%10; 
y=a%100;
z=y/10;
w=a/100;

k=x*x*x+z*z*z+w*w*w;   
if(a==k){
System.out.println(k);
}

}
}
}
class Address{

int housenum;
String area;
String city;

void setHousenum(int housenum)
{
this.housenum=housenum;
}
void setArea(String area){
this.area=area;
}
void setCity(String city){
this.city=city;
}
int getHousenum()
{
return housenum;
}
String getArea(){
return area;
}
String getCity(){
return city;
}

}

class student{
int id;
String name;
Address adr;

void setId(int n){
id=n;
}
void setName(String name){
this.name=name;
}
void setAdr(Address adr){
this.adr=adr;
}

int getId(){
return id;
}
String getName(){
return name;
}
Address getAdr(){
return adr;
}


}

class address_student{
public static void main(String[] arg){
Address ad=new Address();
ad.setHousenum(1);
ad.setCity("aurangabad");
ad.setArea("abc");

student st=new student();
int x=100;
st.setId(x);
st.setName("abcd");
st.setAdr(ad);

int id1;
id1=st.getId();
String n;
n=st.getName();

Address ad1=new Address();
ad1=st.getAdr();
int h ;
h=ad1.getHousenum();
String area;
area=ad1.getArea();
String city;
city=ad1.getCity();

}
}
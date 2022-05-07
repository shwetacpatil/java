abstract class Account{
void getCustInfo(){
System.out.println("Get Cust information");
}
abstract void calculateInterest();
}
class Saving extends Account {
@Override
void calculateInterest(){
System.out.println("Calculate interest of saving");
}
}
class Loan extends Account{
@Override
void calculateInterest(){
System.out.println("Calculate interest of loan");
}
}
class AccountFactory{
public static Account getAccount(String type){
Account obj=null;
if (type.equalsIgnoreCase("savings")){
obj=new Saving();
}else{
obj=new Loan();
}
return obj;
}
}
public class factory_pattern{
public static void main(String[] args){
Account ob1=AccountFactory.getAccount("Loan");
ob1.calculateInterest();
ob1=AccountFactory.getAccount("Saving");
ob1.calculateInterest();
}
}
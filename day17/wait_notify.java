class Share
{
    int x;
    boolean f=false;
    synchronized void get(){
        try{
            if (f==false){
                wait();
            }
        }catch (Exception e){
           
        }
        System.out.println("Got "+x);
        f=false;
        notify();
    }
    synchronized void set(int y){
        try{
            if (f==true){
                wait();
            }
        }catch (Exception e){
           
        }
        System.out.println("Put "+x);
        f=true;
        notify();

    }
}
class Producerr implements Runnable
{
    Thread t;
    Share ob;
    Producerr(Share ob1){
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            ob.set(i);
            i++;
        }
    }
}
class Consumerr implements Runnable
{
    Thread t;
    Share ob;
    Consumerr(Share ob1){
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            ob.get();
            i++;
        }
    }
}

 class Wait_Notify
{
    public static void main(String[] args)
    {
        Share ob=new Share();
        Producerr p=new Producerr(ob);
        Consumerr c=new Consumerr(ob);
    }
}
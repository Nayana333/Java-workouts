class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            if(i==1)
            yield();
            System.out.println("thread a="+i);
        }
    
    System.out.println("exit from thread");
    }
}
class B extends Thread
{
    public void run()
    {
    for(int j=0;j<5;j++)
    {
        if(j==3)
        stop();
        System.out.println("thread b="+j);
    
    }
    System.out.println("exit from thread");

    }
}
class C extends Thread
{
public void run()
{
    for(k=1;k<=5;k++)
    if(k==1)
    try
    {
        sleep(100);
    }
    catch(exception e)
}
System.out.println("thread c="+c);
}
class Threaddemo
{
    public static void main(String arg[])
    {
    A a1=new A();
    B b1=new B();
    C c1=new C();
    System.out.println("start from thread a");
    a1.start();
    System.out.println("start from thread b");
    b1.start();
    System.out.println("start from thread c");
    c1.start();
    }
}
